numbers = list(map(int, input("Enter numbers separated by spaces: ").split()))

# Ascending order
ascending = sorted(numbers)

# Descending order
descending = sorted(numbers, reverse=True)

print("Ascending order:", ascending)
print("Descending order:", descending)
