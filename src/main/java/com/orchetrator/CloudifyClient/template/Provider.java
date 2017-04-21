package com.orchetrator.CloudifyClient.template;

import com.orchetrator.CloudifyClient.model.Response;

public interface Provider {
	Response get(String url);
	Response post(String url);
	Response put(String url);
	Response patch(String url);
	Response delete(String url);
}
