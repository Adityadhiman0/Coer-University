# Input: range of numbers
n = int(input("Enter the range (up to n): "))

# Create dictionary using dictionary comprehension
squares = {x: x**2 for x in range(1, n + 1)}

# Display the dictionary
print("Number-Square dictionary:")
print(squares)
