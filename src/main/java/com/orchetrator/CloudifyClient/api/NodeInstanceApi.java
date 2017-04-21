package com.orchetrator.CloudifyClient.api;

import java.util.List;
import java.util.Map;

import com.orchetrator.CloudifyClient.model.NodeInstance;

public interface NodeInstanceApi{
	NodeInstance getNodeInstance();
	List<NodeInstance> listNodeInstance();
	NodeInstance updateNodeInstance(Map<Object,Object> runtimeProperties, String state, int version);

}