import csv
name = input('Enter student name: ')
with open('students.csv', 'r') as f:
    reader = csv.DictReader(f)
    for row in reader:
        if row['Name'] == name:
            print(row)
            break
    else:
        print('Record not found.')