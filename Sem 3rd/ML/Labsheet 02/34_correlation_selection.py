import pandas as pd, seaborn as sns, matplotlib.pyplot as plt
df=pd.read_csv('students_preprocessing.csv'); x=df.select_dtypes('number'); corr=x.corr(); print(corr); sns.heatmap(corr,annot=True,cmap='coolwarm'); plt.title('Correlation Analysis'); plt.show(); print('\nCorrelation with Marks:\n',corr['Marks'].abs().sort_values(ascending=False))
