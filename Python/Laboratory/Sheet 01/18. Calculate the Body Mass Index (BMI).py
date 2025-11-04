# 18. Calculate the Body Mass Index (BMI).
weight = float(input("Enter your weight in kilograms: "))
height = float(input("Enter your height in meters: "))

# Calculate BMI
bmi = weight / (height ** 2)

# Display the result
print("Your Body Mass Index (BMI) is:", bmi)
