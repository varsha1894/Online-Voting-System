package com.services;

import java.util.List;

import controller.maincontroller.Organizer;

public interface OrganizerService {

	public void insertData(Organizer organizer);
	public List<Organizer> getorganizerList();
}
