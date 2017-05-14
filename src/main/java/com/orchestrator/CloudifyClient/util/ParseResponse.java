package com.orchestrator.CloudifyClient.util;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.orchestrator.CloudifyClient.model.Response;

public class ParseResponse{
	
    private static ParseResponse instance = new ParseResponse();

    public static ParseResponse getInstance() {
        return instance;
    }
	
	private ParseResponse(){}
	
    private final Logger logger = LoggerFactory.getLogger(getClass());
    
	public Response parse(CloseableHttpClient httpClient, HttpUriRequest request){
		Response response = new Response();
		try {
			final CloseableHttpResponse httpResponse = httpClient.execute(request);
			int code = httpResponse.getStatusLine().getStatusCode();
			response.setStatusCode(code);
		    HttpEntity entity = httpResponse.getEntity();
		    EntityUtils.consume(entity);
		    response.setEntity(entity);
		} catch (Exception exception) {
			response.setStatusCode(1000);
			logger.info("can not get http response!");
	    }
		return response;
	}
	
	
}