# 12. Calculate the simple interest given principal, rate, and time.

principal = float(input("Enter the principal amount: "))
rate = float(input("Enter the annual interest rate (in %): "))
time = float(input("Enter the time period (in years): "))
simple_interest = (principal * rate * time) / 100
print("The simple interest is:", simple_interest)
