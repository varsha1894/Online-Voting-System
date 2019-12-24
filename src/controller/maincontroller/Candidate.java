package controller.maincontroller;

public class Candidate {
 
	private String candidateName;
	private String website;
	private long vote; 
	
	public String getCandidateName(){
		return candidateName;
	}
	public void setCandidateName(String candidateName){
		this.candidateName=candidateName;
	}
	public String getWebsite(){
		return website;
	}
	public void setWebsite(String website){
		this.website=website;
	}
	public Long getVote(){
		return vote;
	}
	public void setVote(long vote){
		this.vote=vote;
	}
	
}

