package com.orchestrator.CloudifyClient.api;

import java.util.List;

import com.orchestrator.CloudifyClient.model.Blueprint;

public interface BlueprintApi {
	Blueprint getBlueprint(int BlueprintId);
	boolean uploadBlueprint(String application_file_name, String blueprint_archive_url);
	List<Blueprint> listBlueprint();
	boolean deleteBlueprint();
	Blueprint downloadBlueprint();//stream??
	
}
