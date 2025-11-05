import string

text = input("Enter a string: ")
cleaned_text = ""

for char in text:
    if char not in string.punctuation:
        cleaned_text += char

print("String without punctuation:", cleaned_text)
