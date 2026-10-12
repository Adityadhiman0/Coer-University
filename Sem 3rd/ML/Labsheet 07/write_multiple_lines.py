with open('user_input.txt', 'w') as f:
    print('Enter multiple lines (type END to stop):')
    while True:
        line = input()
        if line == 'END':
            break
        f.write(line + '\n')