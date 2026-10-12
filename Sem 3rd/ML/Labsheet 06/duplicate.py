s = [1, 2, 2, 3, 4, 4, 5]
duplicates = [x for x in s if s.count(x) > 1]
duplicates = set(duplicates)
print('duplicate elements:', duplicates)