numbers = list(map(int, input("Enter numbers separated by spaces: ").split()))

is_sorted = True
for i in range(len(numbers) - 1):
    if numbers[i] > numbers[i + 1]:
        is_sorted = False
        break

if is_sorted:
    print("The list is sorted in ascending order.")
else:
    print("The list is not sorted.")
