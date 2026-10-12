with open('sample.txt', 'r') as f:
    words = set(f.read().split())
with open('unique_words.txt', 'w') as f:
    f.write('\n'.join(words))
print('Unique words saved.')