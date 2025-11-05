text = input("Enter a string: ")
vowels = "aeiouAEIOU"
converted = ""

for char in text:
    if char.isalpha():
        if char in vowels:
            converted += char.upper()
        else:
            converted += char.lower()
    else:
        converted += char  # Keep non-alphabetic characters unchanged

print("Converted string:", converted)
