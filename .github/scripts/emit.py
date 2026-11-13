#!/usr/bin/env python3
"""Development helper: ships a text file out of CI through check-run annotations.

Usage: emit.py <tag> <file> [max_chunks]
The file is gzip-compressed, base64 encoded and split into annotation-sized chunks.
"""
import base64
import gzip
import sys

tag, path = sys.argv[1], sys.argv[2]
limit = int(sys.argv[3]) if len(sys.argv) > 3 else 30
try:
    data = open(path, 'rb').read()
except OSError as error:
    data = f"missing {path}: {error}".encode()
encoded = base64.b64encode(gzip.compress(data, 9)).decode()
size = 3900
chunks = [encoded[i:i + size] for i in range(0, len(encoded), size)] or ['']
kinds = ['notice', 'warning', 'error']
for index, chunk in enumerate(chunks[:limit]):
    kind = kinds[min(index // 10, 2)]
    print(f"::{kind} title={tag}.{index:03d}.{len(chunks):03d}::{chunk}")
