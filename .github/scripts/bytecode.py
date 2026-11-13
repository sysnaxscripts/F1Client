#!/usr/bin/env python3
"""Temporary CI probe: prints invoke/field instructions of selected methods."""
import re, subprocess, sys
jar, spec = sys.argv[1], sys.argv[2]
for line in open(spec):
    line = line.strip()
    if not line or line.startswith('#'):
        continue
    parts = line.split()
    cls, pat = parts[0], re.compile(parts[1])
    body = re.compile(parts[2]) if len(parts) > 2 else None
    out = subprocess.run(['javap', '-c', '-p', '-cp', jar, cls], capture_output=True, text=True).stdout
    print('### ' + cls)
    blocks, cur = [], None
    for l in out.split('\n'):
        if re.match(r'^  \S.*\(.*\).*;$', l):
            cur = [l.strip()]
            blocks.append(cur)
        elif cur is not None:
            cur.append(l)
    for b in blocks:
        name = b[0].split('(')[0].split()[-1]
        if not pat.search(name):
            continue
        if body and not any(body.search(x) for x in b):
            continue
        print(b[0])
        for l in b[1:]:
            if re.search(r'invoke|getfield|putfield|getstatic|putstatic|new |ldc|if|goto|return', l):
                m = re.match(r'\s*(\d+): (\w+)\s+(#?\d+,?\s*\d*)?\s*(//\s*(.*))?', l)
                if m:
                    print('   %s %s %s' % (m.group(1), m.group(2), (m.group(5) or m.group(3) or '').replace('net/minecraft/', '')))
