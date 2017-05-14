package com.orchestrator.CloudifyClient.api;

import java.util.List;
import java.util.Map;

import com.orchestrator.CloudifyClient.model.Execution;

public interface ExecutionApi{
	Execution getExecution();
	List<Execution> listExecution();
	Execution startExecution(String workflowId,
			String deploymentId, boolean allowCustomParameters,
			Map<Object,Object> parameters, boolean force);
	Execution cancelExecution(String action);
	Execution updateExecution(String status);
}