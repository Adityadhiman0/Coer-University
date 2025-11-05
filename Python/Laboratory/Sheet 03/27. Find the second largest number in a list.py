numbers = list(map(int, input("Enter numbers separated by spaces: ").split()))

if len(numbers) < 2:
    print("List must contain at least two numbers.")
else:
    largest = second_largest = float('-inf')

    for num in numbers:
        if num > largest:
            second_largest = largest
            largest = num
        elif largest > num > second_largest:
            second_largest = num

    if second_largest == float('-inf'):
        print("There is no distinct second largest number.")
    else:
        print("Second largest number:", second_largest)
