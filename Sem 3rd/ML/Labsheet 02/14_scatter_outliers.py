import pandas as pd, matplotlib.pyplot as plt
df=pd.read_csv('students_preprocessing.csv'); plt.scatter(df['Age'],df['Marks']); plt.xlabel('Age'); plt.ylabel('Marks'); plt.title('Outlier Scatter Plot'); plt.show()
