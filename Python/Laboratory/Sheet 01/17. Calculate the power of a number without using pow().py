#17. Calculate the power of a number without using pow().
base = float(input("Enter the base number: "))
exponent = int(input("Enter the exponent (positive integer): "))
# Initialize result
result = 1
# Calculate power using a loop
for _ in range(exponent):
    result *= base
# Display the result
print(f"{base} raised to the power of {exponent} is: {result}")
