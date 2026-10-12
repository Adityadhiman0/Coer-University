with open('sample.txt', 'r') as f:
    words = f.read().split()
    print('Number of words:', len(words))