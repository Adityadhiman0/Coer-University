import pandas as pd, numpy as np, matplotlib.pyplot as plt
df=pd.read_csv('students_preprocessing.csv'); x=df['Income'].fillna(df['Income'].median()); y=np.log1p(x); plt.hist(x,alpha=.6,label='Original'); plt.hist(y,alpha=.6,label='Log'); plt.legend(); plt.title('Log Transformation'); plt.show()
