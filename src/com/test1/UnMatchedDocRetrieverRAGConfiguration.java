package com.test1;

public class UnMatchedDocRetrieverRAGConfiguration {
	private long unMatchedDocRetrieverConfigId;
	private long applicationId;
	private String applicationName;
	private String knowledgeBaseId;
	private String embeddingModel;
	private String vectorDatabaseType;
	private String unMatchedDocumentCollection;
	private String childChunkCollection;
	private long unMatchedChunkSize;
	private long childChunkSize;
	private long chunkOverlap;
	private String retrievalStrategy;
	private long topKChildChunks;
	private long maximumUnMatchedDocuments;
	private String similarityThreshold;
	private String rerankingEnabled;
	private String rerankingModel;
	private String unMatchedExpansionEnabled;

	public UnMatchedDocRetrieverRAGConfiguration() {

	}

	public UnMatchedDocRetrieverRAGConfiguration(long unMatchedDocRetrieverConfigId, long applicationId,
			String applicationName, String knowledgeBaseId, String embeddingModel, String vectorDatabaseType,
			String unMatchedDocumentCollection, String childChunkCollection, long unMatchedChunkSize,
			long childChunkSize, long chunkOverlap, String retrievalStrategy, long topKChildChunks,
			long maximumUnMatchedDocuments, String similarityThreshold, String rerankingEnabled, String rerankingModel,
			String unMatchedExpansionEnabled) {
		super();
		this.unMatchedDocRetrieverConfigId = unMatchedDocRetrieverConfigId;
		this.applicationId = applicationId;
		this.applicationName = applicationName;
		this.knowledgeBaseId = knowledgeBaseId;
		this.embeddingModel = embeddingModel;
		this.vectorDatabaseType = vectorDatabaseType;
		this.unMatchedDocumentCollection = unMatchedDocumentCollection;
		this.childChunkCollection = childChunkCollection;
		this.unMatchedChunkSize = unMatchedChunkSize;
		this.childChunkSize = childChunkSize;
		this.chunkOverlap = chunkOverlap;
		this.retrievalStrategy = retrievalStrategy;
		this.topKChildChunks = topKChildChunks;
		this.maximumUnMatchedDocuments = maximumUnMatchedDocuments;
		this.similarityThreshold = similarityThreshold;
		this.rerankingEnabled = rerankingEnabled;
		this.rerankingModel = rerankingModel;
		this.unMatchedExpansionEnabled = unMatchedExpansionEnabled;
	}

	public long getUnMatchedDocRetrieverConfigId() {
		return unMatchedDocRetrieverConfigId;
	}

	public void setUnMatchedDocRetrieverConfigId(long unMatchedDocRetrieverConfigId) {
		this.unMatchedDocRetrieverConfigId = unMatchedDocRetrieverConfigId;
	}

	public long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(long applicationId) {
		this.applicationId = applicationId;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getKnowledgeBaseId() {
		return knowledgeBaseId;
	}

	public void setKnowledgeBaseId(String knowledgeBaseId) {
		this.knowledgeBaseId = knowledgeBaseId;
	}

	public String getEmbeddingModel() {
		return embeddingModel;
	}

	public void setEmbeddingModel(String embeddingModel) {
		this.embeddingModel = embeddingModel;
	}

	public String getVectorDatabaseType() {
		return vectorDatabaseType;
	}

	public void setVectorDatabaseType(String vectorDatabaseType) {
		this.vectorDatabaseType = vectorDatabaseType;
	}

	public String getUnMatchedDocumentCollection() {
		return unMatchedDocumentCollection;
	}

	public void setUnMatchedDocumentCollection(String unMatchedDocumentCollection) {
		this.unMatchedDocumentCollection = unMatchedDocumentCollection;
	}

	public String getChildChunkCollection() {
		return childChunkCollection;
	}

	public void setChildChunkCollection(String childChunkCollection) {
		this.childChunkCollection = childChunkCollection;
	}

	public long getUnMatchedChunkSize() {
		return unMatchedChunkSize;
	}

	public void setUnMatchedChunkSize(long unMatchedChunkSize) {
		this.unMatchedChunkSize = unMatchedChunkSize;
	}

	public long getChildChunkSize() {
		return childChunkSize;
	}

	public void setChildChunkSize(long childChunkSize) {
		this.childChunkSize = childChunkSize;
	}

	public long getChunkOverlap() {
		return chunkOverlap;
	}

	public void setChunkOverlap(long chunkOverlap) {
		this.chunkOverlap = chunkOverlap;
	}

	public String getRetrievalStrategy() {
		return retrievalStrategy;
	}

	public void setRetrievalStrategy(String retrievalStrategy) {
		this.retrievalStrategy = retrievalStrategy;
	}

	public long getTopKChildChunks() {
		return topKChildChunks;
	}

	public void setTopKChildChunks(long topKChildChunks) {
		this.topKChildChunks = topKChildChunks;
	}

	public long getMaximumUnMatchedDocuments() {
		return maximumUnMatchedDocuments;
	}

	public void setMaximumUnMatchedDocuments(long maximumUnMatchedDocuments) {
		this.maximumUnMatchedDocuments = maximumUnMatchedDocuments;
	}

	public String getSimilarityThreshold() {
		return similarityThreshold;
	}

	public void setSimilarityThreshold(String similarityThreshold) {
		this.similarityThreshold = similarityThreshold;
	}

	public String getRerankingEnabled() {
		return rerankingEnabled;
	}

	public void setRerankingEnabled(String rerankingEnabled) {
		this.rerankingEnabled = rerankingEnabled;
	}

	public String getRerankingModel() {
		return rerankingModel;
	}

	public void setRerankingModel(String rerankingModel) {
		this.rerankingModel = rerankingModel;
	}

	public String getUnMatchedExpansionEnabled() {
		return unMatchedExpansionEnabled;
	}

	public void setUnMatchedExpansionEnabled(String unMatchedExpansionEnabled) {
		this.unMatchedExpansionEnabled = unMatchedExpansionEnabled;
	}

}
