a = int(input("Enter first number: "))
b = int(input("Enter second number: "))

# Start from the greater of the two numbers
lcm = max(a, b)

while True:
    if lcm % a == 0 and lcm % b == 0:
        break
    lcm += 1

print("LCM of", a, "and", b, "is:", lcm)
