package controller.maincontroller;

import java.sql.Time;
import java.util.Date;

public class WebsiteCustomize {
	
	private String website;
	private Date startRegisterDate;
	private Date lastRegisterDate;
	private Date votingDate;
	private Time voteStartTime;
	private Time voteFinishTime;
	
	public Date getStartRegisterDate() {
		return startRegisterDate;
	}
	public void setStartRegisterDate(Date startRegisterDate) {
		this.startRegisterDate = startRegisterDate;
	}
	public Date getLastRegisterDate() {
		return lastRegisterDate;
	}
	public void setLastRegisterDate(Date lastRegisterDate) {
		this.lastRegisterDate = lastRegisterDate;
	}
	public Date getVotingDate() {
		return votingDate;
	}
	public void setVotingDate(Date votingDate) {
		this.votingDate = votingDate;
	}
	public Time getVoteStartTime() {
		return voteStartTime;
	}
	public void setVoteStartTime(Time voteStartTime) {
		this.voteStartTime = voteStartTime;
	}
	public Time getVoteFinishTime() {
		return voteFinishTime;
	}
	public void setVoteFinishTime(Time voteFinishTime) {
		this.voteFinishTime = voteFinishTime;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}

}
