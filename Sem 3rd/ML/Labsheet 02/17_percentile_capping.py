import pandas as pd
df=pd.read_csv('students_preprocessing.csv'); c='Marks'; lo=df[c].quantile(.05); hi=df[c].quantile(.95); df[c]=df[c].clip(lo,hi); print(df)
