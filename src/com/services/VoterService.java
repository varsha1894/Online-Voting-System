package com.services;

import java.util.List;

import controller.maincontroller.Voter;

public interface VoterService {
	
	public void insertData(Voter voter);
	public List<Voter> getvoterList();
	public Voter returnElectoralId(String website,String name);
	 public void updateVoted(long ElectoralId,String website,short voted);

}
