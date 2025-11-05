elements = input("Enter list elements separated by spaces: ").split()

result = ""
for item in elements:
    result += item + " "

# Remove trailing space
result = result.strip()

print("Converted string:", result)
