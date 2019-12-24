package controller.maincontroller;

public class Voter {
	
	private long electoralId;
	private String website;
	private String name;
	private String email;
	private String phone;
	private String password;
	private short voted;
	
	public long getElectoralId(){
		return electoralId;
	}
	public void setElectoralId(long electoralId){
		this.electoralId=electoralId;
	}
	public String getWebsite(){
		return website;
	}
	public void setWebsite(String organizerName){
		this.website=organizerName;
	}
	public String getName(){		
		return name;		
	}
    public void setName(String organization){		
		this.name=organization;		
	}
    public String getPhone(){		
		return phone;		
	}
    public void setPhone(String organizerPhone){		
		this.phone=organizerPhone;
	}
    public String getEmail(){		
		return email;		
	}
    public void setEmail(String organizerEmail){		
		this.email=organizerEmail;
	}
    
    public String getPassword(){		
		return password;		
	}
    public void setPassword(String organizerPassword){		
		this.password=organizerPassword;
	}
	public short getVoted() {
		return voted;
	}
	public void setVoted(short voted) {
		this.voted = voted;
	}


}
