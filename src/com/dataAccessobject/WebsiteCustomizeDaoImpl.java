package com.dataAccessobject;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.mapper.WebsiteCustomizeMapper;
import controller.maincontroller.WebsiteCustomize;

public class WebsiteCustomizeDaoImpl implements WebsiteCustomizeDao {
	@Autowired
	DataSource dataSource;
	private JdbcTemplate jdbctemplate;
	
	 public void setDataSource(DataSource dataSource){
		 this.dataSource=dataSource;
		 this.jdbctemplate=new JdbcTemplate(dataSource);
	 }
	@Override
	public void insertData(WebsiteCustomize websitecustomize) {
		
		 String sql = "INSERT INTO customizewebsite"
				    + "(website,startRegisterDate,lastRegisterDate, votingDate,voteStartTime,voteFinishTime) VALUES (?,?,?,?,?,?)";

				 

				  jdbctemplate.update(
				    sql,
				    new Object[] { websitecustomize.getWebsite(),websitecustomize.getStartRegisterDate(),websitecustomize.getLastRegisterDate(),
				    		websitecustomize.getVotingDate(),websitecustomize.getVoteStartTime(),websitecustomize.getVoteFinishTime()});
	
	}


	@Override
	public List<WebsiteCustomize> getwebsitedetailList() {
		
		 String sql="select * from customizewebsite";
		  List <WebsiteCustomize> websitecustomize = jdbctemplate.query(sql,
				  new WebsiteCustomizeMapper());
				  return websitecustomize; 
	}


}
