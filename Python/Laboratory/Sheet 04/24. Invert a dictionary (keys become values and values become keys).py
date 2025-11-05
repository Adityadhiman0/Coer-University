# Original dictionary
original_dict = {
    "Amit": 85,
    "Neha": 92,
    "Rahul": 78,
    "Simran": 92
}

# Invert the dictionary
inverted_dict = {}
for key, value in original_dict.items():
    if value in inverted_dict:
        inverted_dict[value].append(key)
    else:
        inverted_dict[value] = [key]

# Display the inverted dictionary
print("Inverted dictionary:")
print(inverted_dict)
