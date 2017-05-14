package com.orchestrator.CloudifyClient.api.iml;

import java.util.List;

import com.orchestrator.CloudifyClient.api.BlueprintApi;
import com.orchestrator.CloudifyClient.config.Constants;
import com.orchestrator.CloudifyClient.model.Blueprint;
import com.orchestrator.CloudifyClient.template.imp.ProviderImp;


public class BlueprintApiImp implements BlueprintApi{

	public Blueprint getBlueprint(int blueprintId) {
		// TODO Auto-generated method stub
		//uri = {manager-ip}/api/v3/blueprints?id={blueprint-id}
		
		return (Blueprint)ProviderImp.getInstance().get(Constants.MANAGER_IP+"/api/v3/blueprints?id="+blueprintId).getEntity();
	}

	public boolean uploadBlueprint(String application_file_name, String blueprint_archive_url) {
		//PUT "{manager-ip}/api/v3/blueprints/{blueprint-id}?application_file_name={blueprint-id}.yaml&blueprint_archive_url=https://url/to/archive/master.zip"
		// TODO Auto-generated method stub
		return false;//ProviderImp.getInstance().post(uri);
	}

	public List<Blueprint> listBlueprint() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteBlueprint() {
		// TODO Auto-generated method stub
		return false;
	}

	public Blueprint downloadBlueprint() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	/*
	 * 
	 * 
	 * 
        HttpClientHelper helper = HttpClientHelper.getInstance();
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("wd", "test");

        HttpResult getResulet = helper.get("http://baidu.com");
        System.out.println("==================================");
        System.out.println(getResulet);

        HttpResult postResulet = helper.post("http://baidu.com/s", param);
        System.out.println("==================================");
        System.out.println(postResulet);

        System.out.println("==================================");
        HttpClientPool.shutdown();
	 * 
	 * 
	 */
}