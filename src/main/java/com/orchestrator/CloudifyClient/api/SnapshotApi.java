package com.orchestrator.CloudifyClient.api;

import java.util.List;

import com.orchestrator.CloudifyClient.model.Execution;
import com.orchestrator.CloudifyClient.model.Snapshot;

public interface SnapshotApi{
	List<Snapshot> getSnapshot();
	Execution createSnapshot(String includeMetrics, String includeCredentials);
	Snapshot deleteSnapshot();
	Execution RestoreSnapshot(boolean force, boolean recreateDeploymentsEnvs);
	//stream response
	Object downloadSnapshot();
	Snapshot uploadSnapshot(String snapshotArchiveUrl);
	
}