nested_list = [[1, 2], [3, 4], [5, 6]]

flattened_list = []

for sublist in nested_list:
    for item in sublist:
        flattened_list.append(item)

print("Flattened list:", flattened_list)
