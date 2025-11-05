text = input("Enter a string: ")

digits = 0
alphabets = 0
special_chars = 0

for char in text:
    if char.isdigit():
        digits += 1
    elif char.isalpha():
        alphabets += 1
    else:
        special_chars += 1

print("Number of digits:", digits)
print("Number of alphabets:", alphabets)
print("Number of special characters:", special_chars)
