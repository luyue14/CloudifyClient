package com.orchestrator.CloudifyClient.api;

import java.util.List;

import com.orchestrator.CloudifyClient.model.Event;

public interface EventApi{
	List<Event> listEvent();
}
