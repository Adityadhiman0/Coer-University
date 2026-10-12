import pandas as pd
df=pd.read_csv('students_preprocessing.csv'); before=df.isna().sum()
clean=df.copy()
for c in clean.select_dtypes('number'): clean[c]=clean[c].fillna(clean[c].median())
for c in clean.select_dtypes('object'):
    if clean[c].isna().any(): clean[c]=clean[c].fillna(clean[c].mode()[0])
print('BEFORE\n',before,'\nAFTER\n',clean.isna().sum())
