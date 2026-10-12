with open('sample.txt', 'r') as f:
    lines = f.readlines()
print('First line:', lines[0])
print('Last line:', lines[-1])