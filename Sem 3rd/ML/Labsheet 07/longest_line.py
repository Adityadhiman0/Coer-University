with open('sample.txt', 'r') as f:
    lines = f.readlines()
    longest = max(lines, key=len)
print('Longest line:', longest)