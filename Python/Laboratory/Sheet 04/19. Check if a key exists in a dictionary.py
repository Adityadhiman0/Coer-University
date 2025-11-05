# Sample dictionary
student_marks = {
    "Amit": 85,
    "Neha": 92,
    "Rahul": 78
}

# Input key to check
key_to_check = input("Enter the student's name to check: ")

# Check existence
if key_to_check in student_marks:
    print(f"{key_to_check} exists in the dictionary with marks {student_marks[key_to_check]}.")
else:
    print(f"{key_to_check} does not exist in the dictionary.")
