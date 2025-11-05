text = input("Enter a string: ")
frequency = {}

# Count frequency of each character
for char in text:
    frequency[char] = frequency.get(char, 0) + 1

# Find the first character with frequency 1
for char in text:
    if frequency[char] == 1:
        print("First non-repeated character:", char)
        break
else:
    print("No non-repeated character found.")
