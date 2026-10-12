import pandas as pd
from sklearn.preprocessing import LabelEncoder
df=pd.read_csv('students_preprocessing.csv'); df['Gender']=df['Gender'].fillna(df['Gender'].mode()[0]); df['Gender_Encoded']=LabelEncoder().fit_transform(df['Gender']); print(df[['Gender','Gender_Encoded']])
