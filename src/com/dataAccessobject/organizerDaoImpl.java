package com.dataAccessobject;

import java.util.List;

import com.dataAccessobject.organizerDao;
import com.mapper.OrganizerMapper;

import controller.maincontroller.Organizer;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class organizerDaoImpl implements organizerDao{
	@Autowired
	DataSource dataSource;
	private JdbcTemplate jdbctemplate;
	
	 public void setDataSource(DataSource dataSource){
		 this.dataSource=dataSource;
		 this.jdbctemplate=new JdbcTemplate(dataSource);
	 }
	  
	 
	  public void insertData(Organizer organizer){
		  String sql = "INSERT INTO organizer "
				    + "(organizerName,organization,organizerPhone,organizerEmail,website,organizerPassword) VALUES (?,?,?,?,?,?)";

				 

				  jdbctemplate.update(
				    sql,
				    new Object[] { organizer.getOrganizerName(),organizer.getOrganization(),
				      organizer.getOrganizerPhone(), organizer.getOrganizerEmail(),organizer.getWebsite(),organizer.getOrganizerPassword() });
	  }
	
	  public List<Organizer> getorganizerList(){
		  String sql="select * from organizer";
		  List <Organizer> organizer = jdbctemplate.query(sql,
				  new OrganizerMapper());
				  return organizer; 
	  }
	 
/*
	  public void updateData(Organizer organizer);
	  public void deleteData(String id);
	  public Organizer getUser(String id);
*/

}

