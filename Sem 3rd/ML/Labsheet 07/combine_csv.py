import csv, glob
files = glob.glob('*.csv')
with open('combined.csv', 'w', newline='') as out:
    writer = None
    for file in files:
        with open(file, 'r') as f:
            reader = csv.reader(f)
            if writer is None:
                writer = csv.writer(out)
            for row in reader:
                writer.writerow(row)
print('CSV files combined.')