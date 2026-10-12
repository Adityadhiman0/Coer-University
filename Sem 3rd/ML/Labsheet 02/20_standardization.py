import pandas as pd
from sklearn.preprocessing import StandardScaler
df=pd.read_csv('students_preprocessing.csv'); n=df.select_dtypes('number').columns; df[n]=df[n].fillna(df[n].median()); df[n]=StandardScaler().fit_transform(df[n]); print(df)
