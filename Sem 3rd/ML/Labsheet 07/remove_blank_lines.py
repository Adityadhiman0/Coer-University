with open('sample.txt', 'r') as f:
    lines = [line for line in f if line.strip()]
with open('noblank.txt', 'w') as f:
    f.writelines(lines)
print('Blank lines removed.')