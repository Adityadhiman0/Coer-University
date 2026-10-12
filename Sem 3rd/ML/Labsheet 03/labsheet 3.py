# ==========================================
# LAB ASSESSMENT ON SUPERVISED LEARNING (REGRESSION)
# MCA III Semester (2026-2027) - COER University
# ==========================================

import joblib
import matplotlib.pyplot as plt
import numpy as np
import pandas as pd
import seaborn as sns

from sklearn.datasets import fetch_california_housing
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_absolute_error, mean_squared_error, r2_score
from sklearn.model_selection import train_test_split
from sklearn.pipeline import make_pipeline
from sklearn.preprocessing import PolynomialFeatures, StandardScaler

# Set aesthetic visual style
sns.set_theme(style="whitegrid")

# ------------------------------------------
# 1. Load a regression dataset using Pandas
# ------------------------------------------
# Fetching the California Housing Dataset
california = fetch_california_housing(as_frame=True)
df = california.frame

# ------------------------------------------
# 2. Display first and last 5 records
# ------------------------------------------
print("--- First 5 Records ---")
print(df.head())

print("\n--- Last 5 Records ---")
print(df.tail())

# ------------------------------------------
# 3. Explore dataset information & statistics
# ------------------------------------------
print("\n--- Dataset Information ---")
print(df.info())

print("\n--- Descriptive Statistics ---")
print(df.describe())

# ------------------------------------------
# 4. Identify Input and Output Variables
# ------------------------------------------
# Target variable: MedHouseVal (Median House Value in $100k)
# Features: MedInc, HouseAge, AveRooms, etc.
X_simple = df[["MedInc"]]  # Single feature for Simple Linear Regression
X_multi = df[
    [
        "MedInc",
        "HouseAge",
        "AveRooms",
        "AveBedrms",
        "Population",
        "AveOccup",
        "Latitude",
        "Longitude",
    ]
]
y = df["MedHouseVal"]

# ------------------------------------------
# 5. Split Dataset into Train and Test sets
# ------------------------------------------
X_train_s, X_test_s, y_train, y_test = train_test_split(
    X_simple, y, test_size=0.2, random_state=42
)
X_train_m, X_test_m, _, _ = train_test_split(
    X_multi, y, test_size=0.2, random_state=42
)

# ------------------------------------------
# 6. Implement Simple Linear Regression
# ------------------------------------------
simple_lr = LinearRegression()

# ------------------------------------------
# 7. Train Linear Regression Model
# ------------------------------------------
simple_lr.fit(X_train_s, y_train)

# ------------------------------------------
# 8. Predict Output Values
# ------------------------------------------
y_pred_s = simple_lr.predict(X_test_s)

# ------------------------------------------
# 9. Visualize Regression Line
# ------------------------------------------
plt.figure(figsize=(8, 5))
plt.scatter(
    X_test_s, y_test, color="blue", alpha=0.3, label="Actual Data Points"
)
plt.plot(
    X_test_s,
    y_pred_s,
    color="red",
    linewidth=2,
    label="Linear Regression Fit Line",
)
plt.xlabel("Median Income (MedInc)")
plt.ylabel("Median House Value (MedHouseVal)")
plt.title("Simple Linear Regression: MedInc vs MedHouseVal")
plt.legend()
plt.show()

# ------------------------------------------
# 10. Compare Actual vs Predicted Values
# ------------------------------------------
comparison_s = pd.DataFrame(
    {"Actual": y_test.values, "Predicted": y_pred_s}
).head(10)
print("\n--- Simple LR: Actual vs Predicted (First 10) ---")
print(comparison_s)

# ------------------------------------------
# 11. Display Coefficient and Intercept
# ------------------------------------------
print(f"\nSimple LR Coefficient (Slope): {simple_lr.coef_[0]:.4f}")
print(f"Simple LR Intercept: {simple_lr.intercept_:.4f}")

# ------------------------------------------
# 12. Predict Output for New User Input
# ------------------------------------------
new_input = np.array([[5.0]])  # Income = $50,000
new_pred = simple_lr.predict(new_input)
print(
    f"\nPredicted House Value for MedInc=5.0: ${new_pred[0]*100000:.2f} ({new_pred[0]:.4f} units)"
)

# ------------------------------------------
# 13-15. Multiple Linear Regression Implementation & Prediction
# ------------------------------------------
multi_lr = LinearRegression()
multi_lr.fit(X_train_m, y_train)
y_pred_m = multi_lr.predict(X_test_m)

# ------------------------------------------
# 16. Compare Actual vs Predicted Graphically
# ------------------------------------------
plt.figure(figsize=(8, 5))
plt.scatter(
    y_test, y_pred_m, alpha=0.3, color="green", label="Predicted vs Actual"
)
plt.plot(
    [y_test.min(), y_test.max()],
    [y_test.min(), y_test.max()],
    "r--",
    lw=2,
    label="Ideal Fit Line",
)
plt.xlabel("Actual Values")
plt.ylabel("Predicted Values")
plt.title("Multiple Linear Regression: Actual vs Predicted")
plt.legend()
plt.show()

# ------------------------------------------
# 17. Analyze Feature Effects (Coefficients)
# ------------------------------------------
coefficients = pd.DataFrame(
    {"Feature": X_multi.columns, "Coefficient": multi_lr.coef_}
)
print("\n--- Multiple LR Feature Coefficients ---")
print(coefficients.sort_values(by="Coefficient", ascending=False))

# ------------------------------------------
# 18-19. Polynomial Regression (Degrees 2 & 3)
# ------------------------------------------
poly2 = make_pipeline(PolynomialFeatures(degree=2), LinearRegression())
poly3 = make_pipeline(PolynomialFeatures(degree=3), LinearRegression())

poly2.fit(X_train_s, y_train)
poly3.fit(X_train_s, y_train)

# ------------------------------------------
# 20-23. Visualize & Compare Polynomial Regression
# ------------------------------------------
# Generating continuous range for visualization curves
X_seq = np.linspace(X_simple.min(), X_simple.max(), 300).reshape(-1, 1)

plt.figure(figsize=(10, 6))
plt.scatter(X_test_s, y_test, color="gray", alpha=0.2, label="Actual Data")
plt.plot(
    X_seq,
    simple_lr.predict(X_seq),
    color="red",
    label="Linear (Degree 1)",
    linewidth=2,
)
plt.plot(
    X_seq,
    poly2.predict(X_seq),
    color="blue",
    label="Polynomial (Degree 2)",
    linewidth=2,
)
plt.plot(
    X_seq,
    poly3.predict(X_seq),
    color="green",
    label="Polynomial (Degree 3)",
    linewidth=2,
)
plt.xlabel("Median Income")
plt.ylabel("Median House Value")
plt.title("Regression Model Comparison: Linear vs Polynomial (Deg 2 & 3)")
plt.legend()
plt.show()

y_pred_p2 = poly2.predict(X_test_s)
y_pred_p3 = poly3.predict(X_test_s)

# ------------------------------------------
# 24-28. Evaluation Metrics Calculation & Comparison
# ------------------------------------------
def evaluate_model(y_true, y_pred, name):
    mae = mean_absolute_error(y_true, y_pred)
    mse = mean_squared_error(y_true, y_pred)
    rmse = np.sqrt(mse)
    r2 = r2_score(y_true, y_pred)
    return {"Model": name, "MAE": mae, "MSE": mse, "RMSE": rmse, "R2 Score": r2}


results = [
    evaluate_model(y_test, y_pred_s, "Simple Linear"),
    evaluate_model(y_test, y_pred_m, "Multiple Linear"),
    evaluate_model(y_test, y_pred_p2, "Polynomial (Deg 2)"),
    evaluate_model(y_test, y_pred_p3, "Polynomial (Deg 3)"),
]

metrics_df = pd.DataFrame(results)
print("\n--- Model Evaluation Comparison ---")
print(metrics_df)

# ------------------------------------------
# 29. Interpretation of Metrics
# ------------------------------------------
print("\n--- Metric Interpretations ---")
print(
    "MSE (Mean Squared Error): Measures the average squared difference between actual and predicted values. "
    "Penalizes larger errors more heavily due to squaring."
)
print(
    "R² Score (Coefficient of Determination): Represents the proportion of variance in the target variable explained by features. "
    "Values closer to 1.0 indicate higher predictive accuracy."
)

# ------------------------------------------
# 30. Visualize Prediction Errors (Residual Scatter Plot)
# ------------------------------------------
residuals = y_test - y_pred_m
plt.figure(figsize=(8, 5))
plt.scatter(y_pred_m, residuals, alpha=0.3, color="purple")
plt.axhline(y=0, color="red", linestyle="--")
plt.xlabel("Predicted Values")
plt.ylabel("Residuals (Errors)")
plt.title("Residual Analysis: Multiple Linear Regression")
plt.show()

# ------------------------------------------
# 31-32. Feature Standardization & Performance Comparison
# ------------------------------------------
scaler = StandardScaler()
X_train_m_scaled = scaler.fit_transform(X_train_m)
X_test_m_scaled = scaler.transform(X_test_m)

scaled_lr = LinearRegression()
scaled_lr.fit(X_train_m_scaled, y_train)
y_pred_scaled = scaled_lr.predict(X_test_m_scaled)

scaled_r2 = r2_score(y_test, y_pred_scaled)
unscaled_r2 = metrics_df.loc[
    metrics_df["Model"] == "Multiple Linear", "R2 Score"
].values[0]

print(f"\nMultiple LR Unscaled R² Score: {unscaled_r2:.6f}")
print(f"Multiple LR Scaled R² Score:   {scaled_r2:.6f}")

# ------------------------------------------
# 33. Alternate Dataset Execution
# ------------------------------------------
# Demonstrating on standard synthetic dataset
from sklearn.datasets import make_regression

X_alt, y_alt = make_regression(
    n_samples=200, n_features=1, noise=15, random_state=42
)
alt_lr = LinearRegression().fit(X_alt, y_alt)
print(f"\nAlternate Dataset (Synthetic) R² Score: {alt_lr.score(X_alt, y_alt):.4f}")

# ------------------------------------------
# 34-35. Save and Load Trained Model with Joblib
# ------------------------------------------
model_filename = "multiple_linear_model.joblib"

# Save Model
joblib.dump(multi_lr, model_filename)
print(f"\nModel successfully saved to '{model_filename}'")

# Load Model
loaded_model = joblib.load(model_filename)
sample_data = X_test_m.iloc[:1]
loaded_pred = loaded_model.predict(sample_data)
print(f"Loaded Model Prediction for Sample Input: {loaded_pred[0]:.4f}")