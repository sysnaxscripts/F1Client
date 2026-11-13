#!/usr/bin/env python3
"""Temporary CI probe: prints invoke/field instructions of selected methods."""
import re, subprocess, sys
jar, spec = sys.argv[1], sys.argv[2]
for line in open(spec):
    line = line.strip()
    if not line or line.startswith('#'):
        continue
    cls, pattern = line.split(None, 1)
    pat = re.compile(pattern)
    out = subprocess.run(['javap', '-c', '-p', '-cp', jar, cls], capture_output=True, text=True).stdout
    print('### ' + cls)
    show = False
    for l in out.split('\n'):
        if re.match(r'^  \S.*\(.*\).*;$', l):
            show = bool(pat.search(l.split('(')[0].split()[-1]))
            if show:
                print(l.strip())
        elif show and re.search(r'invoke|getfield|putfield|getstatic|putstatic|new |ldc|areturn|ifeq|ifne|return', l):
            m = re.match(r'\s*(\d+): (\w+)\s+(#\d+,?\s*\d*)?\s*(//\s*(.*))?', l)
            if m:
                print('   %s %s %s' % (m.group(1), m.group(2), (m.group(5) or '').replace('net/minecraft/', '')))
