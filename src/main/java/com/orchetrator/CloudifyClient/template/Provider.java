package com.orchetrator.CloudifyClient.template;

import com.orchetrator.CloudifyClient.model.Response;

public interface Provider {
	Response get(String uri);
	Response post(String uri);
	Response put(String uri);
	Response patch(String uri);
	Response delete(String uri);
}
