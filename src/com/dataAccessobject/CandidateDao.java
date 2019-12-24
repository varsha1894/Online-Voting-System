package com.dataAccessobject;

import java.util.List;

import javax.sql.DataSource;

import controller.maincontroller.Candidate;


public interface CandidateDao {

	 public void setDataSource(DataSource dataSource);
	  
	 
	  public void insertCandidate(Candidate candidate);
	 public List<Candidate> getcandidateList();
	/* public void createvoter(String name);*/
	  public void updateVote(Long vote,String name,String website);
	 /* public void deleteData(String id);
	  public Organizer getUser(String id);*/
	  public List<Candidate> getCandidate(String website);


}
