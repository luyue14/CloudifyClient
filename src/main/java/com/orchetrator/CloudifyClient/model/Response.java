package com.orchetrator.CloudifyClient.model;

import org.apache.http.HttpEntity;

public class Response {
	private int statusCode;
	private HttpEntity entity;
	
	
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public HttpEntity getEntity() {
		return entity;
	}
	public void setEntity(HttpEntity entity) {
		this.entity = entity;
	}
	
}
