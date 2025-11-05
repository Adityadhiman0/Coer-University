# Input paragraph
paragraph = input("Enter a paragraph: ")

# Convert to lowercase and split into words
words = paragraph.lower().split()

# Initialize dictionary
word_freq = {}

# Count word frequency
for word in words:
    word = word.strip(".,!?;:\"'()[]{}")  # Remove punctuation
    if word in word_freq:
        word_freq[word] += 1
    else:
        word_freq[word] = 1

# Display word frequencies
print("Word frequencies:")
for word, freq in word_freq.items():
    print(f"'{word}': {freq}")
