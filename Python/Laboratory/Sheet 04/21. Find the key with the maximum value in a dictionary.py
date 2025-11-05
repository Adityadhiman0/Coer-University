# Sample dictionary
student_marks = {
    "Amit": 85,
    "Neha": 92,
    "Rahul": 78,
    "Simran": 90,
    "Priya": 88
}

# Find key with maximum value
max_key = max(student_marks, key=student_marks.get)
max_value = student_marks[max_key]

print(f"Highest marks: {max_value} by {max_key}")
