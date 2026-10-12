import pandas as pd
from sklearn.preprocessing import MinMaxScaler
df=pd.read_csv('students_preprocessing.csv'); n=['Age','Marks','Income']; x=df[n].fillna(df[n].median()); print('Original:\n',x); print('Normalized:\n',pd.DataFrame(MinMaxScaler().fit_transform(x),columns=n))
