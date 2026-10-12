import pandas as pd
df=pd.read_csv('students_preprocessing.csv')
print((df.isnull().sum()/len(df)*100).round(2))
