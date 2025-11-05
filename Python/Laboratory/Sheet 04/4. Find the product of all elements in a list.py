numbers = list(map(float, input("Enter numbers separated by spaces: ").split()))

product = 1
for num in numbers:
    product *= num

print("Product of all elements:", product)
