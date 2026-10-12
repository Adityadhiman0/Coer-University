with open('sample.txt', 'r') as f:
    words = sorted(f.read().split())
with open('sorted_words.txt', 'w') as f:
    f.write('\n'.join(words))
print('Words sorted alphabetically.')