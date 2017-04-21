package com.orchetrator.CloudifyClient.api;

import java.util.List;

import com.orchetrator.CloudifyClient.model.Blueprint;

public interface BlueprintApi {
	Blueprint getBlueprint();
	boolean uploadBlueprint(String application_file_name, String blueprint_archive_url);
	List<Blueprint> listBlueprint();
	boolean deleteBlueprint();
	Blueprint downloadBlueprint();//stream??
	
}
