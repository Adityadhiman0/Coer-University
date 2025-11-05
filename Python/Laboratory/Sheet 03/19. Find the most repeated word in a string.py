text = input("Enter a string: ")
words = text.lower().split()

frequency = {}
for word in words:
    frequency[word] = frequency.get(word, 0) + 1

# Find the word with the highest frequency
most_repeated = max(frequency, key=frequency.get)
print("Most repeated word:", most_repeated)
print("Frequency:", frequency[most_repeated])

