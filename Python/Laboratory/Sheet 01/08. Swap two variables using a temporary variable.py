#8. Swap two variables using a temporary variable.
a = input("Enter the first value (a): ")
b = input("Enter the second value (b): ")
print("Before swapping: a =", a, ", b =", b)
temp = a
a = b
b = temp
print("After swapping: a =", a, ", b =", b)
