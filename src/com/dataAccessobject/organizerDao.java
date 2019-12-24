package com.dataAccessobject;

import java.util.List;

import javax.sql.DataSource;

import controller.maincontroller.Organizer;

public interface organizerDao {

	  public void setDataSource(DataSource dataSource);
	  
	 
	  public void insertData(Organizer organizer);
	 public List<Organizer> getorganizerList();
	/* public void createvoter(String name);*/
	 /* public void updateData(Organizer organizer);
	  public void deleteData(String id);
	  public Organizer getUser(String id);*/

}
