elements = input("Enter elements separated by spaces: ").split()
frequency = {}

for item in elements:
    frequency[item] = frequency.get(item, 0) + 1

print("Element frequencies:")
for key, value in frequency.items():
    print(f"{key}: {value}")
