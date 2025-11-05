numbers = list(map(int, input("Enter numbers separated by spaces: ").split()))
target = int(input("Enter the target sum: "))

pairs = []

for i in range(len(numbers)):
    for j in range(i + 1, len(numbers)):
        if numbers[i] + numbers[j] == target:
            pairs.append((numbers[i], numbers[j]))

print("Pairs with sum", target, ":", pairs)
