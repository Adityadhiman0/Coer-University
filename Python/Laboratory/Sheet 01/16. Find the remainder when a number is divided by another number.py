#16. Find the remainder when a number is divided by another number. 
dividend = int(input("Enter the dividend: "))
divisor = int(input("Enter the divisor: "))
# Check for division by zero
if divisor == 0:
    print("Error: Division by zero is not allowed.")
else:
    # Calculate the remainder
    remainder = dividend % divisor

    # Display the result
    print("The remainder when", dividend, "is divided by", divisor, "is:", remainder)
