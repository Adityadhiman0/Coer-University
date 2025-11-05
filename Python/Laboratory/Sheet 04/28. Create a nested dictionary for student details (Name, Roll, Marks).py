# Number of students
n = int(input("Enter the number of students: "))

# Initialize dictionary
students = {}

# Collect student details
for _ in range(n):
    roll = input("Enter Roll Number: ")
    name = input("Enter Name: ")
    marks = float(input("Enter Marks: "))
    
    # Create nested dictionary for each student
    students[roll] = {
        "Name": name,
        "Marks": marks
    }

# Display nested dictionary
print("\nStudent Details:")
for roll, details in students.items():
    print(f"Roll: {roll}, Name: {details['Name']}, Marks: {details['Marks']}")
