text = input("Enter a string: ")

# Remove spaces and convert to lowercase for uniformity
cleaned_text = text.replace(" ", "").lower()

# Check if the string is equal to its reverse
if cleaned_text == cleaned_text[::-1]:
    print("The string is a palindrome.")
else:
    print("The string is not a palindrome.")
