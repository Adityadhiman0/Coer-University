with open('sample.txt', 'r') as f:
    lines = f.readlines()
    print('Lines:', len(lines))
    print('Characters:', sum(len(line) for line in lines))