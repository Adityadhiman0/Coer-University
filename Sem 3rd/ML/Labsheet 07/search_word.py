word = input('Enter word to search: ')
found = False
with open('sample.txt', 'r') as f:
    for line in f:
        if word in line:
            found = True
            break
print('Word found' if found else 'Word not found')