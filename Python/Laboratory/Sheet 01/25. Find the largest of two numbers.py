# 25. Find the largest of two numbers.
num1 = float(input("Enter the first number: "))
num2 = float(input("Enter the second number: "))
# Compare the numbers
if num1 > num2:
    print("The first number is larger:", num1)
elif num2 > num1:
    print("The second number is larger:", num2)
else:
    print("Both numbers are equal.")
