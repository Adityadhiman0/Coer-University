def rotate_list(lst, n):
    n = n % len(lst)  # Handle cases where n > len(lst)
    return lst[n:] + lst[:n]

# Input
lst = list(map(int, input("Enter list elements separated by spaces: ").split()))
n = int(input("Enter number of positions to rotate: "))

# Output
rotated = rotate_list(lst, n)
print("Rotated list:", rotated)
