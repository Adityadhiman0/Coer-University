import pandas as pd
df=pd.read_csv('students_preprocessing.csv'); cats={v:i for i,v in enumerate(df['City'].dropna().unique())}; df['City_Code']=df['City'].map(cats); bits=max(1,max(cats.values()).bit_length())
for b in range(bits): df[f'City_Bit_{b}']=df['City_Code'].fillna(0).astype(int).apply(lambda x:(x>>b)&1)
print(df[['City','City_Code']+[f'City_Bit_{b}' for b in range(bits)]])
