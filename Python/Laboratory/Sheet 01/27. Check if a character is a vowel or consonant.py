# 27. Check if a character is a vowel or consonant.
char = input("Enter a single alphabet character: ").lower()
# Check if input is a single alphabet letter
if len(char) == 1 and char.isalpha():
    if char in 'aeiou':
        print("The character is a vowel.")
    else:
        print("The character is a consonant.")
else:
    print("Invalid input. Please enter a single alphabet letter.")
