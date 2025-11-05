# Sample dictionary with duplicate values
original_dict = {
    "Amit": 85,
    "Neha": 92,
    "Rahul": 78,
    "Simran": 92,
    "Priya": 85
}

# Remove duplicate values
unique_values = set()
filtered_dict = {}

for key, value in original_dict.items():
    if value not in unique_values:
        filtered_dict[key] = value
        unique_values.add(value)

# Display result
print("Dictionary after removing duplicate values:")
print(filtered_dict)
