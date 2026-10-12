word = input('Enter word to count: ')
with open('sample.txt', 'r') as f:
    text = f.read()
print('Occurrences:', text.count(word))