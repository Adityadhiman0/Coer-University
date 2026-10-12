import csv
with open('students.csv', 'r') as f:
    reader = list(csv.reader(f))
    print('Rows:', len(reader))
    print('Columns:', len(reader[0]) if reader else 0)