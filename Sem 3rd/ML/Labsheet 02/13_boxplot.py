import pandas as pd, matplotlib.pyplot as plt
df=pd.read_csv('students_preprocessing.csv'); plt.boxplot(df['Marks'].dropna()); plt.title('Marks Box Plot'); plt.show()
