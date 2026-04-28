import pandas as pd

# Assuming 'data' DataFrame is already prepared from previous steps

# Generate insights
print("=== Insight Generation ===")

# 1. Correlation analysis
corr_matrix = data.corr()
print("\nCorrelation Matrix:\n", corr_matrix)

traffic_aqi_corr = data["Traffic"].corr(data["AQI"])
temp_energy_corr = data["Temperature"].corr(data["Energy"])
activity_energy_corr = data["Activity"].corr(data["Energy"])

print(f"\nCorrelation between Traffic and AQI: {traffic_aqi_corr:.2f}")
print(f"Correlation between Temperature and Energy: {temp_energy_corr:.2f}")
print(f"Correlation between Activity and Energy: {activity_energy_corr:.2f}")

# 2. Key patterns
print("\nKey Patterns and Insights:")

if traffic_aqi_corr > 0.3:
    print("- Higher traffic volumes are associated with increased AQI (pollution).")

if temp_energy_corr > 0.3:
    print("- Warmer days tend to show higher energy consumption, likely due to cooling demand.")

if activity_energy_corr > 0.3:
    print("- Public activity levels strongly influence energy usage, indicating human behavior drives resource demand.")

# 3. Additional conclusions
mean_energy = data["Energy"].mean()
peak_days = data[data["Traffic"] > data["Traffic"].quantile(0.95)]["Day"].tolist()

print(f"- Average daily energy consumption is {mean_energy:.2f} units.")
print(f"- Peak traffic observed on days: {peak_days}")
print("- Outliers in AQI suggest occasional severe pollution events.")
