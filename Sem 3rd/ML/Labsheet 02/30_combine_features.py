import pandas as pd
df=pd.read_csv('students_preprocessing.csv'); df['Name_City']=df['Name'].fillna('Unknown')+'_'+df['City'].fillna('Unknown'); print(df[['Name','City','Name_City']])
