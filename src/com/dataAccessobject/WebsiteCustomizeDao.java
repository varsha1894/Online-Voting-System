package com.dataAccessobject;

import java.util.List;
import javax.sql.DataSource;

import controller.maincontroller.WebsiteCustomize;

public interface WebsiteCustomizeDao {
	 public void setDataSource(DataSource dataSource);
	  
	 
	  public void insertData(WebsiteCustomize websitecustomize);
	 public List<WebsiteCustomize> getwebsitedetailList();
	/* public void createvoter(String name);*/
	 /* public void updateData(Organizer organizer);
	  public void deleteData(String id);
	  public Organizer getUser(String id);*/


}
