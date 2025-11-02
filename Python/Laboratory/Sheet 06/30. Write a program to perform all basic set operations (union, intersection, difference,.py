#30. Write a program to perform all basic set operations (union, intersection, difference
#symmetric difference) in one program.
set1 = {1, 2, 3, 4, 5, 6, 7, 8}
set2 = {4, 5, 6, 9, 10}

# Union
union_set = set1.union(set2)        
print("Union:", union_set)

# Intersection
intersection_set = set1.intersection(set2)
print("Intersection:", intersection_set)

# Difference
difference_set = set1.difference(set2)
print("Difference (set1 - set2):", difference_set)

# Symmetric Difference
symmetric_difference_set = set1.symmetric_difference(set2)
print("Symmetric Difference:", symmetric_difference_set)



