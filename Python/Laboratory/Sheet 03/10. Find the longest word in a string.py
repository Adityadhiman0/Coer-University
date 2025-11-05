text = input("Enter a string: ")
words = text.split()

longest = ""
for word in words:
    if len(word) > len(longest):
        longest = word

print("The longest word is:", longest)
print("Length:", len(longest))
