package com.orchetrator.CloudifyClient.api.iml;

import java.util.List;

import com.orchetrator.CloudifyClient.api.SnapshotApi;
import com.orchetrator.CloudifyClient.model.Execution;
import com.orchetrator.CloudifyClient.model.Snapshot;

public class SnapshotApiImp implements SnapshotApi{

	public List<Snapshot> getSnapshot() {
		// TODO Auto-generated method stub
		return null;
	}

	public Execution createSnapshot(String includeMetrics, String includeCredentials) {
		// TODO Auto-generated method stub
		return null;
	}

	public Snapshot deleteSnapshot() {
		// TODO Auto-generated method stub
		return null;
	}

	public Execution RestoreSnapshot(boolean force, boolean recreateDeploymentsEnvs) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object downloadSnapshot() {
		// TODO Auto-generated method stub
		return null;
	}

	public Snapshot uploadSnapshot(String snapshotArchiveUrl) {
		// TODO Auto-generated method stub
		return null;
	}
	
}