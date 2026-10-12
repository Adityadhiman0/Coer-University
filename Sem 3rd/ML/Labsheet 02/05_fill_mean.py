import pandas as pd
df=pd.read_csv('students_preprocessing.csv')
for c in df.select_dtypes('number'): df[c]=df[c].fillna(df[c].mean())
print(df)
