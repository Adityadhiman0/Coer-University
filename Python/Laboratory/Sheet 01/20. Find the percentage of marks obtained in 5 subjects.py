# Initialize total marks
total_marks = 0

# Loop to get marks for 5 subjects
for i in range(1, 6):
    marks = float(input(f"Enter marks for Subject {i}: "))
    total_marks += marks

# Calculate percentage (assuming each subject is out of 100)
percentage = (total_marks / 500) * 100

# Display the result
print("Total Marks:", total_marks)
print("Percentage:", percentage, "%")
