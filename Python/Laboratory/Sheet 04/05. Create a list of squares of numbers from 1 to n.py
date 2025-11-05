n = int(input("Enter a number: "))

squares = []
for i in range(1, n + 1):
    squares.append(i ** 2)

print("List of squares from 1 to", n, ":", squares)
