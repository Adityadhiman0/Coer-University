# Sample dictionary
data = {
    "banana": 3,
    "apple": 5,
    "cherry": 2,
    "date": 4
}

# Sort by values
sorted_by_values = dict(sorted(data.items(), key=lambda item: item[1]))

# Display result
print("Dictionary sorted by values:")
for key, value in sorted_by_values.items():
    print(f"{key}: {value}")
