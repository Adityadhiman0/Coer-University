numbers = list(map(float, input("Enter numbers separated by spaces: ").split()))

total = 0
for num in numbers:
    total += num

average = total / len(numbers) if numbers else 0

print("Sum of elements:", total)
print("Average of elements:", average)
