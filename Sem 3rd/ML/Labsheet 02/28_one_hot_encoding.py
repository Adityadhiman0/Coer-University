import pandas as pd
df=pd.read_csv('students_preprocessing.csv'); print(pd.get_dummies(df,columns=['City'],dtype=int))
