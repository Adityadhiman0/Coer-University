import pandas as pd
df=pd.read_csv('students_preprocessing.csv')
for c in df.select_dtypes('object'):
    if df[c].isna().any(): df[c]=df[c].fillna(df[c].mode()[0])
print(df)
