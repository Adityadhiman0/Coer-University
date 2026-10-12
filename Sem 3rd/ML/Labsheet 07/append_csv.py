import csv
with open('students.csv', 'a', newline='') as f:
    writer = csv.writer(f)
    name = input('Name: ')
    age = input('Age: ')
    marks = input('Marks: ')
    writer.writerow([name, age, marks])