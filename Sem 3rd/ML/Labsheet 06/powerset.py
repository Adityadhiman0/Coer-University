from itertools import chain, combinations
def powerset(s):
    return list(chain.from_iterable(combinations(s, r) for r in range(len(s)+1)))
s = {1, 2, 3}
print('powerset:', powerset(s))