package com.orchestrator.CloudifyClient.api;

import java.util.List;
import java.util.Map;

import com.orchestrator.CloudifyClient.model.NodeInstance;

public interface NodeInstanceApi{
	NodeInstance getNodeInstance();
	List<NodeInstance> listNodeInstance();
	NodeInstance updateNodeInstance(Map<Object,Object> runtimeProperties, String state, int version);

}