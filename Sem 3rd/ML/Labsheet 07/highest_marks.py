import csv
with open('students.csv', 'r') as f:
    reader = csv.DictReader(f)
    highest = max(reader, key=lambda x: float(x['Marks']))
    print('Topper:', highest['Name'], 'Marks:', highest['Marks'])