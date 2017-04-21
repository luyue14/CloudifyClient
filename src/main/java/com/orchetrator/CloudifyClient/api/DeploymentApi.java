package com.orchetrator.CloudifyClient.api;

import java.util.List;
import java.util.Map;

import com.orchetrator.CloudifyClient.model.Deployment;

public interface DeploymentApi{
	Deployment getDeployment();
	List<Deployment> listDeployment();
	boolean createDeployment(String blueprintId, Map<Object,Object> inputs);
	boolean deleteDeployment(boolean ignoreLiveNodes);
}