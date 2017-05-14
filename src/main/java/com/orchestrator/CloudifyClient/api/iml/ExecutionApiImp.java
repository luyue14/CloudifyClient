package com.orchestrator.CloudifyClient.api.iml;

import java.util.List;
import java.util.Map;

import com.orchestrator.CloudifyClient.api.ExecutionApi;
import com.orchestrator.CloudifyClient.model.Execution;

public class ExecutionApiImp implements ExecutionApi{

	public Execution getExecution() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Execution> listExecution() {
		// TODO Auto-generated method stub
		return null;
	}

	public Execution startExecution(String workflowId, String deploymentId, boolean allowCustomParameters,
			Map<Object, Object> parameters, boolean force) {
		// TODO Auto-generated method stub
		return null;
	}

	public Execution cancelExecution(String action) {
		// TODO Auto-generated method stub
		return null;
	}

	public Execution updateExecution(String status) {
		// TODO Auto-generated method stub
		return null;
	}
	
}