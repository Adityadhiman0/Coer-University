# 2. Check if a number is a palindrome.
num = int(input("Enter a number: "))
rev = 0
temp = num

while temp > 0:
    rev = rev * 10 + temp % 10
    temp //= 10

if num == rev:
    print("Palindrome")
else:
    print("Not a palindrome")
