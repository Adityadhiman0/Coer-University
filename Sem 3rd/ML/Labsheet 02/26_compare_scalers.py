import pandas as pd
from sklearn.preprocessing import MinMaxScaler,StandardScaler,RobustScaler,MaxAbsScaler
df=pd.read_csv('students_preprocessing.csv'); x=df[['Age','Marks','Income']].fillna(df[['Age','Marks','Income']].median())
for name,s in {'MinMax':MinMaxScaler(),'Standard':StandardScaler(),'Robust':RobustScaler(),'MaxAbs':MaxAbsScaler()}.items(): print('\n'+name+'\n',pd.DataFrame(s.fit_transform(x),columns=x.columns))
