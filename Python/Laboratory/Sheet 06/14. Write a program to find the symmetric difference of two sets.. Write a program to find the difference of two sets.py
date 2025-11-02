#Write a program to find the symmetric difference of two sets.

set1 = {1, 2, 3, 4, 5}
set2 = {4, 5, 6, 7, 8, 9, 10}
symmetric_diff = set1.symmetric_difference(set2)     #we can use(set1 ^ set2) also
print(symmetric_diff)