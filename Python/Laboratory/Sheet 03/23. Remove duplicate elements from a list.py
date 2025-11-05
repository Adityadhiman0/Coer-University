numbers = list(map(int, input("Enter numbers separated by spaces: ").split()))
unique_numbers = []

for num in numbers:
    if num not in unique_numbers:
        unique_numbers.append(num)

print("List without duplicates:", unique_numbers)
