package com.orchestrator.CloudifyClient.factory;

import com.orchestrator.CloudifyClient.api.iml.BlueprintApiImp;

public class CloudifyClientAPIFactory {
	private static volatile BlueprintApiImp blueprintApi;
	
	private CloudifyClientAPIFactory() {
		
	}
	
	public static BlueprintApiImp getBlueprintApi(){
		if (blueprintApi == null) {
			blueprintApi = new BlueprintApiImp();
		}
		
		return blueprintApi;
	}
	
	
}
