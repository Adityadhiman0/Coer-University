#15. Write a program to check if a set is a subset of another set.
U = {1, 2, 3, 4, 5, 6, 7, 8}
set1 = {1, 2, 3, 4, 5}

if set1.issubset(U):
    print("set1 is a subset of U")
else:
    print("set1 is not a subset of U")
    