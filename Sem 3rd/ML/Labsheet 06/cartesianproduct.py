s1 = {1, 2, 3}
s2 = {'a', 'b', 'c'}
cartesian_product = {(a, b) for a in s1 for b in s2}
print('cartesian product:', cartesian_product)