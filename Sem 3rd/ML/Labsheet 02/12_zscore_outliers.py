import pandas as pd
df=pd.read_csv('students_preprocessing.csv'); c='Marks'; z=(df[c]-df[c].mean())/df[c].std(); print(df[z.abs()>3])
