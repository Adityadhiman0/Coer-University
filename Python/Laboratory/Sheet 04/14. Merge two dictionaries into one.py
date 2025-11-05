# Define two dictionaries
dict1 = {'a': 1, 'b': 2}
dict2 = {'b': 3, 'c': 4}

# Merge using dictionary unpacking (Python 3.5+)
merged_dict = {**dict1, **dict2}

print("Merged dictionary:", merged_dict)
