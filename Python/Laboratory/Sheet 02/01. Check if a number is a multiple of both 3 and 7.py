# 1. Check if a number is a multiple of both 3 and 7.
num = int(input("Enter a number: "))

# Check if the number is divisible by both 3 and 7
if num % 3 == 0 and num % 7 == 0:
    print("The number is a multiple of both 3 and 7.")
else:
    print("The number is not a multiple of both 3 and 7.")
    
