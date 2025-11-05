list1 = input("Enter elements of the first list separated by spaces: ").split()
list2 = input("Enter elements of the second list separated by spaces: ").split()

difference = []

for item in list1:
    if item not in list2:
        difference.append(item)

print("Elements in list1 but not in list2:", difference)
