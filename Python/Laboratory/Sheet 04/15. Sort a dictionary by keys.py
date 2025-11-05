student_marks = {
    "Rahul": 78,
    "Neha": 92,
    "Amit": 85,
    "Simran": 90,
    "Priya": 88
}

# Sort the dictionary by keys
sorted_dict = dict(sorted(student_marks.items()))

print("Dictionary sorted by keys:")
for name, marks in sorted_dict.items():
    print(f"{name}: {marks}")
