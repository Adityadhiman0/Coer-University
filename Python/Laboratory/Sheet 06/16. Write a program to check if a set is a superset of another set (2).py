#16. Write a program to check if a set is a superset of another set.
U = {1, 2, 3, 4, 5, 6, 7, 8}
set = {1, 2, 3, 4, }

if U.issuperset(set):
    print("U is a super set of set")
else:
    print("U is not a super set of set")
    