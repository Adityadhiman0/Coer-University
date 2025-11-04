 # 4. Divide two integers and display the quotient and remainder.

num1 = int(input("Enter the dividend (first integer): "))
num2 = int(input("Enter the divisor (second integer): "))

if num2 == 0:
    print("Error: Division by zero is not allowed.")
else:
    quotient = num1 // num2
    remainder = num1 % num2

    print("Quotient:", quotient)
    print("Remainder:", remainder)
