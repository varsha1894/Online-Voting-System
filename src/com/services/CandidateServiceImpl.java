package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dataAccessobject.CandidateDao;

import controller.maincontroller.Candidate;

@Service("candidateservice")
public class CandidateServiceImpl implements CandidateService {
	@Autowired
	 CandidateDao candidatedao;

	 @Override
	 public void insertCandidate(Candidate candidate) {
	  candidatedao.insertCandidate(candidate);
	 }
	 public List<Candidate> getcandidateList(){
		 return candidatedao.getcandidateList();
	 }
	 public void updateVote(long vote,String name,String website){
		  candidatedao.updateVote(vote, name, website);
	 }
	 public List<Candidate> getCandidate(String website){
		 return candidatedao.getCandidate(website);
	 }
}
