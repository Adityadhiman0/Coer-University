import pandas as pd, matplotlib.pyplot as plt
from sklearn.preprocessing import MinMaxScaler
df=pd.read_csv('students_preprocessing.csv'); x=df[['Marks']].fillna(df[['Marks']].median()); y=MinMaxScaler().fit_transform(x).ravel(); plt.hist(x['Marks'],alpha=.6,label='Original'); plt.hist(y,alpha=.6,label='Normalized'); plt.legend(); plt.show()
