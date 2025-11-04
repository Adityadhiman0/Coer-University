# 13. Calculate the compound interest given principal, rate, and time.
principal = float(input("Enter the principal amount: "))
rate = float(input("Enter the annual interest rate (in %): "))
time = float(input("Enter the time period (in years): "))

# Calculate compound interest
amount = principal * (1 + rate / 100) ** time
compound_interest = amount - principal

# Display the result
print("The compound interest is:", compound_interest)
print("The total amount after", time, "years is:", amount)
