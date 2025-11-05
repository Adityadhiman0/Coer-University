elements = input("Enter list elements separated by spaces: ").split()
mid = len(elements) // 2

first_half = elements[:mid]
second_half = elements[mid:]

print("First half:", first_half)
print("Second half:", second_half)
