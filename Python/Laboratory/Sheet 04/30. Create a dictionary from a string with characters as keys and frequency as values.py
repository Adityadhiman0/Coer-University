# Input string
text = input("Enter a string: ")

# Initialize dictionary
char_freq = {}

# Count character frequency
for char in text:
    if char in char_freq:
        char_freq[char] += 1
    else:
        char_freq[char] = 1

# Display result
print("Character frequency dictionary:")
print(char_freq)
