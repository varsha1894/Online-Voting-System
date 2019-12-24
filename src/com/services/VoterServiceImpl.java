package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dataAccessobject.VoterDao;

import controller.maincontroller.Voter;

@Service("voterservice")
public class VoterServiceImpl implements VoterService {
	
	@Autowired
	 VoterDao voterdao;

	 @Override
	 public void insertData(Voter voter) {
	  voterdao.insertData(voter);
	 }
	 public List<Voter> getvoterList(){
		 return voterdao.getvoterList();
	 }
	 public Voter returnElectoralId(String website,String name){
       return voterdao.returnElectoralId(website, name);
	 }
	 public void updateVoted(long ElectoralId,String website,short voted){
		 voterdao.updateVoted(ElectoralId, website, voted);
	 }
}
