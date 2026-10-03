package com.test1;

public class UnMatchedDocRetrieverRAGRetrieval {
	private long unMatchedDocRetrievalId;
	private long unMatchedDocRetrieverConfigId;
	private String sessionId;
	private String userQuery;
	private String queryEmbeddingReference;
	private String retrievedChildChunksIds;
	private long retrievedChildChunkCount;
	private String matchedUnMatchedDocumentsIds;
	private long retrievedUnMatchedDcoumentsCounts;
	private String childSimilarityScores;
	private String unMatchedRelevanceScores;
	private long duplicateUnMatchedsRemoved;
	private String rerankingApplied;
	private String rerankedUnMatchedDocuments;
	private String selectedUnMatchedSDocuments;
	private String assembledContext;
	private long contextTokenCount;
	private long retrievalLatency;

	public UnMatchedDocRetrieverRAGRetrieval() {

	}

	public UnMatchedDocRetrieverRAGRetrieval(long unMatchedDocRetrievalId, long unMatchedDocRetrieverConfigId,
			String sessionId, String userQuery, String queryEmbeddingReference, String retrievedChildChunksIds,
			long retrievedChildChunkCount, String matchedUnMatchedDocumentsIds, long retrievedUnMatchedDcoumentsCounts,
			String childSimilarityScores, String unMatchedRelevanceScores, long duplicateUnMatchedsRemoved,
			String rerankingApplied, String rerankedUnMatchedDocuments, String selectedUnMatchedSDocuments,
			String assembledContext, long contextTokenCount, long retrievalLatency) {
		super();
		this.unMatchedDocRetrievalId = unMatchedDocRetrievalId;
		this.unMatchedDocRetrieverConfigId = unMatchedDocRetrieverConfigId;
		this.sessionId = sessionId;
		this.userQuery = userQuery;
		this.queryEmbeddingReference = queryEmbeddingReference;
		this.retrievedChildChunksIds = retrievedChildChunksIds;
		this.retrievedChildChunkCount = retrievedChildChunkCount;
		this.matchedUnMatchedDocumentsIds = matchedUnMatchedDocumentsIds;
		this.retrievedUnMatchedDcoumentsCounts = retrievedUnMatchedDcoumentsCounts;
		this.childSimilarityScores = childSimilarityScores;
		this.unMatchedRelevanceScores = unMatchedRelevanceScores;
		this.duplicateUnMatchedsRemoved = duplicateUnMatchedsRemoved;
		this.rerankingApplied = rerankingApplied;
		this.rerankedUnMatchedDocuments = rerankedUnMatchedDocuments;
		this.selectedUnMatchedSDocuments = selectedUnMatchedSDocuments;
		this.assembledContext = assembledContext;
		this.contextTokenCount = contextTokenCount;
		this.retrievalLatency = retrievalLatency;
	}

	public long getUnMatchedDocRetrievalId() {
		return unMatchedDocRetrievalId;
	}

	public void setUnMatchedDocRetrievalId(long unMatchedDocRetrievalId) {
		this.unMatchedDocRetrievalId = unMatchedDocRetrievalId;
	}

	public long getUnMatchedDocRetrieverConfigId() {
		return unMatchedDocRetrieverConfigId;
	}

	public void setUnMatchedDocRetrieverConfigId(long unMatchedDocRetrieverConfigId) {
		this.unMatchedDocRetrieverConfigId = unMatchedDocRetrieverConfigId;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getUserQuery() {
		return userQuery;
	}

	public void setUserQuery(String userQuery) {
		this.userQuery = userQuery;
	}

	public String getQueryEmbeddingReference() {
		return queryEmbeddingReference;
	}

	public void setQueryEmbeddingReference(String queryEmbeddingReference) {
		this.queryEmbeddingReference = queryEmbeddingReference;
	}

	public String getRetrievedChildChunksIds() {
		return retrievedChildChunksIds;
	}

	public void setRetrievedChildChunksIds(String retrievedChildChunksIds) {
		this.retrievedChildChunksIds = retrievedChildChunksIds;
	}

	public long getRetrievedChildChunkCount() {
		return retrievedChildChunkCount;
	}

	public void setRetrievedChildChunkCount(long retrievedChildChunkCount) {
		this.retrievedChildChunkCount = retrievedChildChunkCount;
	}

	public String getMatchedUnMatchedDocumentsIds() {
		return matchedUnMatchedDocumentsIds;
	}

	public void setMatchedUnMatchedDocumentsIds(String matchedUnMatchedDocumentsIds) {
		this.matchedUnMatchedDocumentsIds = matchedUnMatchedDocumentsIds;
	}

	public long getRetrievedUnMatchedDcoumentsCounts() {
		return retrievedUnMatchedDcoumentsCounts;
	}

	public void setRetrievedUnMatchedDcoumentsCounts(long retrievedUnMatchedDcoumentsCounts) {
		this.retrievedUnMatchedDcoumentsCounts = retrievedUnMatchedDcoumentsCounts;
	}

	public String getChildSimilarityScores() {
		return childSimilarityScores;
	}

	public void setChildSimilarityScores(String childSimilarityScores) {
		this.childSimilarityScores = childSimilarityScores;
	}

	public String getUnMatchedRelevanceScores() {
		return unMatchedRelevanceScores;
	}

	public void setUnMatchedRelevanceScores(String unMatchedRelevanceScores) {
		this.unMatchedRelevanceScores = unMatchedRelevanceScores;
	}

	public long getDuplicateUnMatchedsRemoved() {
		return duplicateUnMatchedsRemoved;
	}

	public void setDuplicateUnMatchedsRemoved(long duplicateUnMatchedsRemoved) {
		this.duplicateUnMatchedsRemoved = duplicateUnMatchedsRemoved;
	}

	public String getRerankingApplied() {
		return rerankingApplied;
	}

	public void setRerankingApplied(String rerankingApplied) {
		this.rerankingApplied = rerankingApplied;
	}

	public String getRerankedUnMatchedDocuments() {
		return rerankedUnMatchedDocuments;
	}

	public void setRerankedUnMatchedDocuments(String rerankedUnMatchedDocuments) {
		this.rerankedUnMatchedDocuments = rerankedUnMatchedDocuments;
	}

	public String getSelectedUnMatchedSDocuments() {
		return selectedUnMatchedSDocuments;
	}

	public void setSelectedUnMatchedSDocuments(String selectedUnMatchedSDocuments) {
		this.selectedUnMatchedSDocuments = selectedUnMatchedSDocuments;
	}

	public String getAssembledContext() {
		return assembledContext;
	}

	public void setAssembledContext(String assembledContext) {
		this.assembledContext = assembledContext;
	}

	public long getContextTokenCount() {
		return contextTokenCount;
	}

	public void setContextTokenCount(long contextTokenCount) {
		this.contextTokenCount = contextTokenCount;
	}

	public long getRetrievalLatency() {
		return retrievalLatency;
	}

	public void setRetrievalLatency(long retrievalLatency) {
		this.retrievalLatency = retrievalLatency;
	}

}
