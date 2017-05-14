package com.orchestrator.CloudifyClient.api;

import java.util.List;

import com.orchestrator.CloudifyClient.model.Plugin;

public interface PluginApi{
	Plugin getPlugin();
	Plugin deletePlugin();
	List<Plugin> listPlugin();
	Plugin uploadPlugin(String pluginPath, String pluginArchiveUrl);
	//return the requested plugin archive
	String downloadPlugin();
}