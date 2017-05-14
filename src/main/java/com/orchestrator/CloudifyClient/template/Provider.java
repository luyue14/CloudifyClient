package com.orchestrator.CloudifyClient.template;

import com.orchestrator.CloudifyClient.model.Response;

public interface Provider {
	Response get(String uri);
	Response post(String uri);
	Response put(String uri);
	Response patch(String uri);
	Response delete(String uri);
}
