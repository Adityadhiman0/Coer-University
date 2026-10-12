import csv
with open('students.csv', 'r') as f:
    reader = csv.DictReader(f)
    total = count = 0
    for row in reader:
        total += float(row['Marks'])
        count += 1
    print('Average Marks:', total/count if count else 0)