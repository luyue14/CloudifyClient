package com.orchetrator.CloudifyClient.template.imp;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.orchetrator.CloudifyClient.model.Response;

public class ProviderImp {
	
	CloseableHttpClient httpclient = HttpClients.createDefault();
	//不支持https
	public Response get(String url) {		
		Response response = new Response();
		CloseableHttpResponse httpResponse;
		HttpGet httpGet;
		try{
			httpGet = new HttpGet(url);
	    	httpResponse = httpclient.execute(httpGet);
	    	response = getResponse(httpResponse);
			httpResponse.close();
		}catch(Exception e) {
			//自定义status code 600，命令执行错误
			response.setStatusCode(600);
		}
		return response;
	}
	
	public Response post() {
		Response response = new Response();
		
		return response;
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
	
	
	public Response getResponse(CloseableHttpResponse httpResponse) throws IOException{
		Response response = new Response();
		response.setStatusCode(httpResponse.getStatusLine().getStatusCode());
	    HttpEntity entity = httpResponse.getEntity();
	    EntityUtils.consume(entity);
	    response.setEntity(entity);
		return response;
	}
}
