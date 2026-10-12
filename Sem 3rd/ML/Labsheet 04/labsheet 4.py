# ==============================================================================
# MCA III Semester - Lab Sheet-04: Unsupervised Learning (Clustering & PCA)
# ==============================================================================

import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns

from sklearn.datasets import load_iris
from sklearn.preprocessing import StandardScaler
from sklearn.cluster import KMeans, AgglomerativeClustering
from sklearn.decomposition import PCA
from sklearn.metrics import silhouette_score
from scipy.cluster.hierarchy import dendrogram, linkage

# Set style for graphics
sns.set_theme(style="whitegrid")

# ------------------------------------------------------------------------------
# 1. Load a dataset suitable for clustering
# ------------------------------------------------------------------------------
iris = load_iris()
df = pd.DataFrame(data=iris.data, columns=iris.feature_names)

# ------------------------------------------------------------------------------
# 2. Display the first and last five records
# ------------------------------------------------------------------------------
print("--- First 5 Records ---")
print(df.head())

print("\n--- Last 5 Records ---")
print(df.tail())

# ------------------------------------------------------------------------------
# 3. Explore dataset information, summary statistics, and data types
# ------------------------------------------------------------------------------
print("\n--- Dataset Info ---")
print(df.info())

print("\n--- Summary Statistics ---")
print(df.describe())

# ------------------------------------------------------------------------------
# 4. Select relevant numerical features for clustering
# ------------------------------------------------------------------------------
X = df.copy()

# ------------------------------------------------------------------------------
# 5. Standardize the dataset before clustering using StandardScaler
# ------------------------------------------------------------------------------
scaler = StandardScaler()
X_scaled = scaler.fit_transform(X)
X_scaled_df = pd.DataFrame(X_scaled, columns=X.columns)

# ==============================================================================
# K-MEANS CLUSTERING
# ==============================================================================

# 6. Implement the K-Means clustering algorithm
# 7. Apply K-Means clustering with K=2
kmeans_k2 = KMeans(n_clusters=2, random_state=42, n_init=10)
labels_k2 = kmeans_k2.fit_predict(X_scaled)

# 8. Apply K-Means clustering with K=3
kmeans_k3 = KMeans(n_clusters=3, random_state=42, n_init=10)
labels_k3 = kmeans_k3.fit_predict(X_scaled)

# 9 & 10. Determine the optimal number of clusters using the Elbow Method
inertia = []
K_range = range(1, 11)
for k in K_range:
    km = KMeans(n_clusters=k, random_state=42, n_init=10)
    km.fit(X_scaled)
    inertia.append(km.inertia_)

plt.figure(figsize=(8, 4))
plt.plot(K_range, inertia, marker='o', linestyle='--')
plt.title("Elbow Method For Optimal K")
plt.xlabel("Number of Clusters (K)")
plt.ylabel("Inertia (WCSS)")
plt.show()

# 11. Visualize clusters (K=3) using a scatter plot
plt.figure(figsize=(7, 5))
plt.scatter(X_scaled[:, 0], X_scaled[:, 1], c=labels_k3, cmap='viridis', edgecolors='k')
plt.title("K-Means Clusters (K=3) - First Two Scaled Features")
plt.xlabel("Sepal Length (scaled)")
plt.ylabel("Sepal Width (scaled)")

# 12. Display the cluster centroids obtained from K-Means
centroids = kmeans_k3.cluster_centers_
plt.scatter(centroids[:, 0], centroids[:, 1], c='red', s=200, marker='X', label='Centroids')
plt.legend()
plt.show()

print("\n--- Cluster Centroids (Scaled Features) ---")
print(pd.DataFrame(centroids, columns=X.columns))

# 13. Assign cluster labels to the original dataset
df['KMeans_Cluster'] = labels_k3

# 14. Compare clustering results before and after feature scaling
kmeans_unscaled = KMeans(n_clusters=3, random_state=42, n_init=10).fit_predict(X)
print("\nInertia with Scaled Data:", kmeans_k3.inertia_)

# ==============================================================================
# HIERARCHICAL CLUSTERING
# ==============================================================================

# 15. Implement Agglomerative Hierarchical Clustering
# 16. Generate a dendrogram using the SciPy library
plt.figure(figsize=(10, 5))
linked = linkage(X_scaled, method='ward')
dendrogram(linked, orientation='top', distance_sort='descending', show_leaf_counts=True)
plt.title("Hierarchical Clustering Dendrogram (Ward Linkage)")
plt.xlabel("Sample Index")
plt.ylabel("Euclidean Distance")
plt.show()

# 17. Apply Hierarchical Clustering using Ward linkage
hc_ward = AgglomerativeClustering(n_clusters=3, linkage='ward')
labels_ward = hc_ward.fit_predict(X_scaled)

# 18. Apply Hierarchical Clustering using Complete linkage
hc_complete = AgglomerativeClustering(n_clusters=3, linkage='complete')
labels_complete = hc_complete.fit_predict(X_scaled)

# 19. Compare different linkage methods
print("\nSilhouette Score (Ward Linkage):", silhouette_score(X_scaled, labels_ward))
print("Silhouette Score (Complete Linkage):", silhouette_score(X_scaled, labels_complete))

# 20. Visualize Hierarchical Clustering results
plt.figure(figsize=(7, 5))
plt.scatter(X_scaled[:, 0], X_scaled[:, 1], c=labels_ward, cmap='plasma', edgecolors='k')
plt.title("Hierarchical Clustering Results (Ward Linkage)")
plt.xlabel("Sepal Length (scaled)")
plt.ylabel("Sepal Width (scaled)")
plt.show()

# 21. Compare Hierarchical Clustering with K-Means clustering
df['Hierarchical_Cluster'] = labels_ward
print("\nCrosstab: K-Means vs Hierarchical Clustering")
print(pd.crosstab(df['KMeans_Cluster'], df['Hierarchical_Cluster']))

# ==============================================================================
# PRINCIPAL COMPONENT ANALYSIS (PCA)
# ==============================================================================

# 22. Apply Principal Component Analysis (PCA) to reduce dataset dimensions
# 23. Reduce dataset from multiple features to two principal components
pca = PCA(n_components=2)
X_pca = pca.fit_transform(X_scaled)

# 24. Visualize transformed data using a 2D scatter plot
pca_df = pd.DataFrame(data=X_pca, columns=['PC1', 'PC2'])
pca_df['Cluster'] = df['KMeans_Cluster']

plt.figure(figsize=(7, 5))
sns.scatterplot(x='PC1', y='PC2', hue='Cluster', data=pca_df, palette='Set1', s=70)
plt.title("2D Projection using PCA")
plt.show()

# 25. Display explained variance ratio of principal components
print("\nExplained Variance Ratio per PC:", pca.explained_variance_ratio_)

# 26. Determine cumulative explained variance
cumulative_var = np.sum(pca.explained_variance_ratio_)
print("Cumulative Explained Variance (2 PCs):", cumulative_var)

# 27. Compare dataset before and after dimensionality reduction
print("\nShape before PCA:", X_scaled.shape)
print("Shape after PCA:", X_pca.shape)

# 28. Perform K-Means clustering on the PCA-transformed dataset
kmeans_pca = KMeans(n_clusters=3, random_state=42, n_init=10)
labels_pca = kmeans_pca.fit_predict(X_pca)

# 29. Compare clustering performance before and after applying PCA
score_before_pca = silhouette_score(X_scaled, labels_k3)
score_after_pca = silhouette_score(X_pca, labels_pca)

print(f"\nSilhouette Score BEFORE PCA: {score_before_pca:.4f}")
print(f"Silhouette Score AFTER PCA:  {score_after_pca:.4f}")

# ==============================================================================
# EVALUATION AND ANALYSIS
# ==============================================================================

# 30. Calculate Silhouette Score for cluster evaluation
# 31. Compare Silhouette Scores for different values of K
print("\n--- Silhouette Scores for Various K (K-Means) ---")
for k in range(2, 6):
    km_test = KMeans(n_clusters=k, random_state=42, n_init=10)
    lbls = km_test.fit_predict(X_scaled)
    score = silhouette_score(X_scaled, lbls)
    print(f"K = {k}: Silhouette Score = {score:.4f}")

# 32. Analyze characteristics of each cluster using descriptive statistics
df_original_features = df.drop(columns=['Hierarchical_Cluster'])
cluster_profile = df_original_features.groupby('KMeans_Cluster').mean()
print("\n--- Mean Feature Values per K-Means Cluster ---")
print(cluster_profile)

# 33. Visualize cluster distributions using pair plots
sns.pairplot(df.drop(columns=['Hierarchical_Cluster']), hue='KMeans_Cluster', palette='Set1')
plt.suptitle("Pair Plot of Clusters", y=1.02)
plt.show()

# 34. Save the clustered dataset as a CSV file
df.to_csv("clustered_output.csv", index=False)
print("\nProcessed dataset successfully saved to 'clustered_output.csv'.")