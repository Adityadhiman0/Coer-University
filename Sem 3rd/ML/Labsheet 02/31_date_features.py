import pandas as pd
df=pd.read_csv('students_preprocessing.csv'); d=pd.to_datetime(df['ExamDate']); df['Year']=d.dt.year; df['Month']=d.dt.month; df['Day']=d.dt.day; print(df[['ExamDate','Year','Month','Day']])
