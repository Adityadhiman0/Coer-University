import csv
with open('students.csv', 'w', newline='') as f:
    writer = csv.writer(f)
    writer.writerow(['Name', 'Age', 'Marks'])
    while True:
        name = input('Name (or END to stop): ')
        if name == 'END': break
        age = input('Age: ')
        marks = input('Marks: ')
        writer.writerow([name, age, marks])