text = input("Enter a string: ")
words = text.split()
title_case = ""

for word in words:
    if len(word) > 0:
        first_char = word[0].upper()
        rest = word[1:].lower()
        title_case += first_char + rest + " "

print("Title case string:", title_case.strip())
