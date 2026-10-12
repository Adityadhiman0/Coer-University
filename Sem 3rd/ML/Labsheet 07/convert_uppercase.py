with open('sample.txt', 'r') as f:
    data = f.read().upper()
with open('uppercase.txt', 'w') as f:
    f.write(data)
print('File converted to uppercase.')