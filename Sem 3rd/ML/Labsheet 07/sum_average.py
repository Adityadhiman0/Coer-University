with open('numbers.txt', 'r') as f:
    numbers = [float(x) for x in f.read().split()]
print('Sum:', sum(numbers))
print('Average:', sum(numbers)/len(numbers))