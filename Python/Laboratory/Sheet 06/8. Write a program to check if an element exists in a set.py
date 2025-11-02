
#8. Write a program to check if an element exists in a set.

set = set()
n = int(input("Enter number of elements you want to add in set: "))
for i in range(n):  
    element = int(input("Enter element: "))
    set.add(element)           
element = int(input("Enter an element you want to find in set: "))
if element in set:
    print(f"{element} is exist in set")
else:
    print(f"{element} is not exist in set")