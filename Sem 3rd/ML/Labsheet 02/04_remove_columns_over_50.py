import pandas as pd
df=pd.read_csv('students_preprocessing.csv')
cols=df.columns[df.isnull().mean()>0.50]
print('Removed:',list(cols)); print(df.drop(columns=cols))
