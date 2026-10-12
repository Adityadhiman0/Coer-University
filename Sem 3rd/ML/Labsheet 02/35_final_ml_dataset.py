import pandas as pd
from sklearn.preprocessing import StandardScaler
df=pd.read_csv('students_preprocessing.csv')
for c in df.select_dtypes('number'): df[c]=df[c].fillna(df[c].median())
for c in df.select_dtypes('object'):
    if df[c].isna().any(): df[c]=df[c].fillna(df[c].mode()[0])
df=df.drop_duplicates()
q1,q3=df['Marks'].quantile([.25,.75]); i=q3-q1; df=df[df['Marks'].between(q1-1.5*i,q3+1.5*i)]
d=pd.to_datetime(df['ExamDate']); df['Year']=d.dt.year; df['Month']=d.dt.month; df['Day']=d.dt.day; df=df.drop(columns='ExamDate')
df=pd.get_dummies(df,columns=['City','Gender'],dtype=int)
n=['Age','Marks','Income']; df[n]=StandardScaler().fit_transform(df[n]); df.to_csv('final_preprocessed_dataset.csv',index=False); print(df); print('\nSaved: final_preprocessed_dataset.csv')
