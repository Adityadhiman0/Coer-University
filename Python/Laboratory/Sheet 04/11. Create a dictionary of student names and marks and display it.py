# Create an empty dictionary
student_marks = {}

# Input number of students
n = int(input("Enter the number of students: "))

# Collect names and marks
for _ in range(n):
    name = input("Enter student name: ")
    marks = float(input(f"Enter marks for {name}: "))
    student_marks[name] = marks

# Display the dictionary
print("\nStudent Marks:")
for name, marks in student_marks.items():
    print(f"{name}: {marks}")
