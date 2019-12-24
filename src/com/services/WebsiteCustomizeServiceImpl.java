package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dataAccessobject.WebsiteCustomizeDao;
import controller.maincontroller.WebsiteCustomize;

@Service("websitecustomizeservice")
public class WebsiteCustomizeServiceImpl implements WebsiteCustomizeService {
	@Autowired
	 WebsiteCustomizeDao websitecustomizedao;

	 @Override
	 public void insertData(WebsiteCustomize websitecustomize) {
		 websitecustomizedao.insertData(websitecustomize);
	 }
	 public List<WebsiteCustomize> getwebsitedetailList(){
		 return websitecustomizedao.getwebsitedetailList();
	 }}
