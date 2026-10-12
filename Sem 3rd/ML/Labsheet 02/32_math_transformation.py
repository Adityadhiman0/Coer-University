import pandas as pd, numpy as np
df=pd.read_csv('students_preprocessing.csv'); df['Marks_Squared']=df['Marks'].fillna(df['Marks'].median())**2; df['Log_Income']=np.log1p(df['Income'].fillna(df['Income'].median())); print(df[['Marks','Marks_Squared','Income','Log_Income']])
