package controller.maincontroller;



public class Organizer {
	private String organizerName;
	private String organization;
	private String organizerPhone;
	private String organizerEmail;
	private String website;
	private String organizerPassword;
	
	
	public String getOrganizerName(){
		return organizerName;
	}
	public void setOrganizerName(String organizerName){
		this.organizerName=organizerName;
	}
	public String getOrganization(){		
		return organization;		
	}
    public void setOrganization(String organization){		
		this.organization=organization;		
	}
    public String getOrganizerPhone(){		
		return organizerPhone;		
	}
    public void setOrganizerPhone(String organizerPhone){		
		this.organizerPhone=organizerPhone;
	}
    public String getOrganizerEmail(){		
		return organizerEmail;		
	}
    public void setOrganizerEmail(String organizerEmail){		
		this.organizerEmail=organizerEmail;
	}
    public String getWebsite(){		
		return website;		
	}
    public void setWebsite(String website){		
		this.website=website;
	}
    public String getOrganizerPassword(){		
		return organizerPassword;		
	}
    public void setOrganizerPassword(String organizerPassword){		
		this.organizerPassword=organizerPassword;
	}
}
