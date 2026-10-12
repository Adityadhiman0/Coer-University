old = input('Word to replace: ')
new = input('New word: ')
with open('sample.txt', 'r') as f:
    text = f.read().replace(old, new)
with open('sample.txt', 'w') as f:
    f.write(text)
print('Word replaced.')