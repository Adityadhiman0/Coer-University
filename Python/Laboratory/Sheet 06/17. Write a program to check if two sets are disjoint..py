#17. Write a program to check if two sets are disjoint.
set1 = {1, 2, 3, 4, 5, 6, 7, 8}
set2 = {1, 2, 3, 4, }

if set1.isdisjoint(set2):
    print("set1 and set2 are disjoint sets")
else:
    print("set1 and set2 are not disjoint set")
    