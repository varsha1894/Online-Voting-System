package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dataAccessobject.organizerDao;

import controller.maincontroller.Organizer;
@Service("orgservice")
public class OrganizerServiceImpl implements OrganizerService {
	@Autowired
	 organizerDao organizerdao;

	 @Override
	 public void insertData(Organizer organizer) {
	  organizerdao.insertData(organizer);
	 }
	 public List<Organizer> getorganizerList(){
		 return organizerdao.getorganizerList();
	 }
}
