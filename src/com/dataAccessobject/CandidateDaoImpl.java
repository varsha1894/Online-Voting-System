package com.dataAccessobject;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mapper.CandidateMapper;
import controller.maincontroller.Candidate;

public class CandidateDaoImpl implements CandidateDao {

	@Autowired
	DataSource dataSource;
	private JdbcTemplate jdbctemplate;
	
	 public void setDataSource(DataSource dataSource){
		 this.dataSource=dataSource;
		 this.jdbctemplate=new JdbcTemplate(dataSource);
	 }
	  
	 
	  public void insertCandidate(Candidate candidate){
		  String sql = "INSERT INTO candidates "
				    + "(website,candidateName) VALUES (?,?)";

				 

				  jdbctemplate.update(
				    sql,
				    new Object[] { candidate.getWebsite(),candidate.getCandidateName()});
	  }
	
	  public List<Candidate> getcandidateList(){
		  String sql="select * from candidates";
		  List <Candidate> candidate = jdbctemplate.query(sql,
				  new CandidateMapper());
				  return candidate; 
	  }
     
	  public void updateVote(Long vote,String name,String website){
		  String sql = "UPDATE candidates SET vote=? WHERE website=? AND candidateName=?";
				  jdbctemplate.update(
				    sql,
				    new Object[] { vote,website,name});
  
	  }
//	  public void deleteData(String id);
	  public List<Candidate> getCandidate(String website){
		  String sql="Select * from candidates where website=?";
		  List<Candidate> candidate=jdbctemplate.query(sql, new Object[] {website},new CandidateMapper());
		  
		  return candidate;
	  }



}
