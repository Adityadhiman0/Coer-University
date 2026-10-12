with open('sample.txt', 'a') as f:
    new_content = input('Enter text to append: ')
    f.write('\n' + new_content)