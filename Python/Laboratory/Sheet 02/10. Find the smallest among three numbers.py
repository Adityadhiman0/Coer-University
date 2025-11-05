a = float(input("Enter first number: "))
b = float(input("Enter second number: "))
c = float(input("Enter third number: "))

smallest = a

if b < smallest:
    smallest = b
if c < smallest:
    smallest = c

print("Smallest number is:", smallest)
