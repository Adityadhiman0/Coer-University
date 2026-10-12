import pandas as pd, matplotlib.pyplot as plt
from sklearn.preprocessing import StandardScaler,MinMaxScaler
df=pd.read_csv('students_preprocessing.csv'); x=df[['Marks']].fillna(df[['Marks']].median()); plt.boxplot([x['Marks'],StandardScaler().fit_transform(x).ravel(),MinMaxScaler().fit_transform(x).ravel()],labels=['Original','Standard','MinMax']); plt.show()
