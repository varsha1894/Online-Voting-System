package com.dataAccessobject;

import java.util.List;
import javax.sql.DataSource;
import controller.maincontroller.Voter;

public interface VoterDao {

	 public void setDataSource(DataSource dataSource);
	 public void insertData(Voter voter);
	 public List<Voter> getvoterList();
	 public void updateVoted(long ElectoralId,String website,short voted);
	 public Voter returnElectoralId(String website,String name);
}
