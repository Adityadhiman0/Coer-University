# Sample dictionary
student_marks = {
    "Amit": 85,
    "Neha": 92,
    "Rahul": 78
}

# Update value
key_to_update = input("Enter the student's name to update: ")
new_marks = float(input(f"Enter new marks for {key_to_update}: "))

if key_to_update in student_marks:
    student_marks[key_to_update] = new_marks
    print(f"Updated {key_to_update}'s marks to {new_marks}.")
else:
    print(f"{key_to_update} not found in the dictionary.")

# Display updated dictionary
print("Updated student marks:", student_marks)
