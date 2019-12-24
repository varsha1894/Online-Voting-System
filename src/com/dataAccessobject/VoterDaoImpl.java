package com.dataAccessobject;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mapper.VoterMapper;

import controller.maincontroller.Voter;

public class VoterDaoImpl implements VoterDao{
	@Autowired
	DataSource dataSource;
	private JdbcTemplate jdbctemplate;
	
	 public void setDataSource(DataSource dataSource){
		 this.dataSource=dataSource;
		 this.jdbctemplate=new JdbcTemplate(dataSource);
	 }
	  
	 
	  public void insertData(Voter voter){
		  String sql = "INSERT INTO voter "
				    + "(website,name,email,phone,password) VALUES (?,?,?,?,?)";

				 

				  jdbctemplate.update(
				    sql,
				    new Object[] { voter.getWebsite(),voter.getName(),
				      voter.getEmail(),voter.getPhone(),voter.getPassword()});
	  }
	
	  public List<Voter> getvoterList(){
		  String sql="select * from voter";
		  List <Voter> voter = jdbctemplate.query(sql,
				  new VoterMapper());
				  return voter; 
	  }

	  public Voter returnElectoralId(String website,String name){
		  String sql="Select * from voter where website=? AND name=?";
		 
		 Voter voter = (Voter)jdbctemplate.queryForObject(
					sql, new Object[] {website,name}, new VoterMapper());

		  return voter;
	  }
	  public void updateVoted(long ElectoralId,String website,short voted){
		  
		  String sql = "UPDATE voter SET voted=? WHERE electoralId=? and website=?";
		  jdbctemplate.update(
		    sql,
		    new Object[] { voted,ElectoralId,website});		  
	  }
/*
	  public void updateData(Organizer organizer);
	  public void deleteData(String id);
	  public Organizer getUser(String id);
*/



}
