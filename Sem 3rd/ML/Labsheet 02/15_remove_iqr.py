import pandas as pd
df=pd.read_csv('students_preprocessing.csv'); c='Marks'; q1=df[c].quantile(.25); q3=df[c].quantile(.75); i=q3-q1; lo=q1-1.5*i; hi=q3+1.5*i; print(df[df[c].between(lo,hi)])
