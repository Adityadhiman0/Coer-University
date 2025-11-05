import math

num = int(input("Enter a number: "))
temp = num
sum_of_factorials = 0

while temp != 0:
    digit = temp % 10
    sum_of_factorials += math.factorial(digit)
    temp //= 10

if sum_of_factorials == num:
    print(num, "is a strong number")
else:
    print(num, "is not a strong number")
