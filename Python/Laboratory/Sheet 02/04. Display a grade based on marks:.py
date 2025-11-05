
marks = int(input("Enter your marks: "))

if 90 <= marks <= 100:
    print("Grade: A")
elif 75 <= marks < 90:
    print("Grade: B")
elif 50 <= marks < 75:
    print("Grade: C")
else:
    print("Grade: F")
