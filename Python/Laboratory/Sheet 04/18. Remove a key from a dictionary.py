# Sample dictionary
student_marks = {
    "Amit": 85,
    "Neha": 92,
    "Rahul": 78
}

# Input key to remove
key_to_remove = input("Enter the student's name to remove: ")

# Remove the key if it exists
if key_to_remove in student_marks:
    del student_marks[key_to_remove]
    print(f"{key_to_remove} has been removed.")
else:
    print(f"{key_to_remove} not found in the dictionary.")

# Display updated dictionary
print("Updated student marks:", student_marks)
