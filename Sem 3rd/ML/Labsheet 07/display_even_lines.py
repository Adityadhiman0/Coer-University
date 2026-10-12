with open('sample.txt', 'r') as f:
    for i, line in enumerate(f, 1):
        if i % 2 == 0:
            print(line, end='')