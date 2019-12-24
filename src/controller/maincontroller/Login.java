package controller.maincontroller;

public class Login {

	private long electoralId;
	private String password;
	
	public  long getElectoralId(){
		return electoralId;
	}
	public void setElectoralId(long electoralId){
		this.electoralId=electoralId;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password=password;
	}
}
