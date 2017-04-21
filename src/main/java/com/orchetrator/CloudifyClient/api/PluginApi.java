package com.orchetrator.CloudifyClient.api;

import java.util.List;

import com.orchetrator.CloudifyClient.model.Plugin;

public interface PluginApi{
	Plugin getPlugin();
	Plugin deletePlugin();
	List<Plugin> listPlugin();
	Plugin uploadPlugin(String pluginPath, String pluginArchiveUrl);
	//return the requested plugin archive
	String downloadPlugin();
}