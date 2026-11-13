#!/usr/bin/env python3
"""Development helper: shrinks the Nth screenshot to a WebP that fits the annotation budget."""
import glob
import io
import sys

from PIL import Image

index, out = int(sys.argv[1]), sys.argv[2]
files = sorted(glob.glob('shots/**/*.png', recursive=True))
print(len(files), 'screenshots', file=sys.stderr)
if index >= len(files):
    open(out, 'wb').write(b'none')
    sys.exit(0)
image = Image.open(files[index]).convert('RGB')
if image.width > 1280:
    image = image.resize((1280, round(image.height * 1280 / image.width)), Image.LANCZOS)
for quality in (80, 70, 60, 50, 40, 30, 20):
    buffer = io.BytesIO()
    image.save(buffer, 'WEBP', quality=quality, method=6)
    if buffer.tell() <= 84000:
        break
name = files[index].split('/')[-1].encode()
open(out, 'wb').write(name + b'\n' + buffer.getvalue())
