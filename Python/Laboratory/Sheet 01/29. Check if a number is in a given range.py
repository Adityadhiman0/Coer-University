# 29. Check if a number is in a given range.
num = float(input("Enter the number to check: "))
lower = float(input("Enter the lower limit of the range: "))
upper = float(input("Enter the upper limit of the range: "))
# Check if the number is within the range
if lower <= num <= upper:
    print(f"The number {num} is within the range [{lower}, {upper}].")
else:
    print(f"The number {num} is outside the range [{lower}, {upper}].")
