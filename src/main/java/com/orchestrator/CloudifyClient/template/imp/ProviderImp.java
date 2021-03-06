package com.orchestrator.CloudifyClient.template.imp;

import java.util.Map;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.orchestrator.CloudifyClient.HttpClientPool.HttpClientPool;
import com.orchestrator.CloudifyClient.config.Constants;
import com.orchestrator.CloudifyClient.model.Response;
import com.orchestrator.CloudifyClient.util.ParseResponse;

public class ProviderImp {
	
	private static final ProviderImp instance = new ProviderImp();

    public static ProviderImp getInstance() {
        return instance;
    }

    private ProviderImp() {
    }

    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final RequestConfig defaultRequestConfig = RequestConfig.custom().setSocketTimeout(Constants.SOCKET_TIME_OUT).setConnectTimeout(Constants.SOCKET_TIME_OUT)
            .setConnectionRequestTimeout(Constants.SOCKET_TIME_OUT).build();
	
	CloseableHttpClient httpclient = HttpClients.createDefault();
	//不支持https
	public Response get(String uri, Map<String, String> headers, Map<String, Object> parameters) {		
		if (uri == null || uri.isEmpty()) {
            throw new IllegalArgumentException("uri is required");
        }

        RequestBuilder requestBuilder = RequestBuilder.get();
        requestBuilder.setUri(uri);

        // Populate request parameters
        if (parameters != null && !parameters.isEmpty()) {
            for (final String key : parameters.keySet()) {
                if (parameters.get(key) != null) {
                    requestBuilder.addParameter(key, String.valueOf(parameters.get(key)));
                }
            }
        }

        // Request configuration can be overridden at the request level.
        // They will take precedence over the one set at the client level.
        requestBuilder.setConfig(defaultRequestConfig);

        // Set custom header
        if (headers != null && !headers.isEmpty()) {
            for (final String key : headers.keySet()) {
                requestBuilder.addHeader(key, headers.get(key));
            }
        }

        return ParseResponse.getInstance().parse(HttpClientPool.getClient(), requestBuilder.build());
	}
	
	public Response get(String uri) {		
		return get(uri, null, null);
	}
	
	public Response post(String uri) {
		return post(uri, null, null, null);
	}
	
	public Response post(String uri, Map<String, String> headers, Map<String, Object> parameters, byte[] body) {

        if (uri == null || uri.isEmpty()) {
            throw new IllegalArgumentException("uri is required");
        }

        final RequestBuilder requestBuilder = RequestBuilder.post();
        requestBuilder.setUri(uri);

        // Populate request parameters
        if (parameters != null && !parameters.isEmpty()) {
            for (final String key : parameters.keySet()) {
                if (parameters.get(key) != null) {
                    requestBuilder.addParameter(key, String.valueOf(parameters.get(key)));
                }
            }
        }
        // Populate request body
        if (body != null) {
            requestBuilder.setEntity(new ByteArrayEntity(body));
        }

        // Request configuration can be overridden at the request level.
        // They will take precedence over the one set at the client level.
        requestBuilder.setConfig(defaultRequestConfig);

        // Set custom header
        if (headers != null && !headers.isEmpty()) {
            for (final String key : headers.keySet()) {
                requestBuilder.addHeader(key, headers.get(key));
            }
        }

        return ParseResponse.getInstance().parse(HttpClientPool.getClient(), requestBuilder.build());
    }
	
	public Response put() {
		Response response = new Response();
		
		return response;
	}
	
	public Response patch(){
		Response response = new Response();
		
		return response;
	}
	
	public Response delete(){
		Response response = new Response();
		
		return response;
	}
	

}
