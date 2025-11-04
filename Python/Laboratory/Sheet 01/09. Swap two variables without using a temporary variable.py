#9. Swap two variables without using a temporary variable.

a = input("Enter the first value (a): ")
b = input("Enter the second value (b): ")
print("Before swapping: a =", a, ", b =", b)
a, b = b, a
# Display swapped values
print("After swapping: a =", a, ", b =", b)
