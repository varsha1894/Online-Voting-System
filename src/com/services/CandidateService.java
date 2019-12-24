package com.services;

import java.util.List;

import controller.maincontroller.Candidate;

public interface CandidateService {
	public void insertCandidate(Candidate candidate);
	public List<Candidate> getcandidateList();
	public void updateVote(long vote,String name,String website);
	public List<Candidate> getCandidate(String website);


}
