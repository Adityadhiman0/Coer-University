student_marks = {
    "Amit": 85,
    "Neha": 92,
    "Rahul": 78,
    "Simran": 90,
    "Priya": 88
}

# Find maximum and minimum marks
max_marks = max(student_marks.values())
min_marks = min(student_marks.values())

# Find corresponding students
top_students = [name for name, marks in student_marks.items() if marks == max_marks]
bottom_students = [name for name, marks in student_marks.items() if marks == min_marks]

print("Highest Marks:", max_marks, "by", top_students)
print("Lowest Marks:", min_marks, "by", bottom_students)
