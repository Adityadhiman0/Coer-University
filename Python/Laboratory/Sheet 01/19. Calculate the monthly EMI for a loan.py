# 19. Calculate the monthly EMI for a loan.
principal = float(input("Enter the loan amount (principal): "))
annual_rate = float(input("Enter the annual interest rate (in %): "))
tenure_years = int(input("Enter the loan tenure (in years): "))

# Convert annual rate to monthly and years to months
monthly_rate = annual_rate / (12 * 100)
tenure_months = tenure_years * 12

# Calculate EMI
emi = (principal * monthly_rate * (1 + monthly_rate) ** tenure_months) / ((1 + monthly_rate) ** tenure_months - 1)

# Display the result
print("The monthly EMI is: ₹{:.2f}".format(emi))
