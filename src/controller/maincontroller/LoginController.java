package controller.maincontroller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.services.CandidateService;
import com.services.OrganizerService;
import com.services.VoterService;
import com.services.WebsiteCustomizeService;
 
@Controller
public class LoginController{
	@Autowired
	VoterService voterservice;
	@Autowired
	OrganizerService organizerservice;
	@Autowired
	CandidateService candidateservice;
	@Autowired
	WebsiteCustomizeService websitecustomizeservice;
	
	@InitBinder
	
	public void initbinder(WebDataBinder binder){
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd");
		binder.registerCustomEditor(Date.class,"startRegisterDate",new CustomDateEditor(dateFormat,false));
		binder.registerCustomEditor(Date.class,"lastRegisterDate",new CustomDateEditor(dateFormat,false));
		binder.registerCustomEditor(Date.class,"votingDate",new CustomDateEditor(dateFormat,false));
		dateFormat  = new SimpleDateFormat("HH:mm:ss");
		binder.registerCustomEditor(Date.class,"voteStartTime",new CustomDateEditor(dateFormat,false));
		binder.registerCustomEditor(Date.class,"voteFinishTime",new CustomDateEditor(dateFormat,false));
	}
	
	
   @RequestMapping(value="/login",method=RequestMethod.GET)
		public ModelAndView hello(){
 		ModelAndView modelandview = new ModelAndView("login");
		modelandview.addObject("welcomeMessage", "my first project");
		
		return modelandview;
	}
  
   @RequestMapping(value="/SubmitLogin", method=RequestMethod.POST)
   public ModelAndView retrieveData(HttpServletRequest request,@Validated @ModelAttribute("login") LoginOrganizer login, BindingResult result) {
	  
	   ModelAndView modelandview;
	   modelandview=new ModelAndView("login");	
	   if(result.hasErrors()){
		
			    modelandview.addObject("errorMessage","*Invalid login Elector Id or Password");
			
	   }
	   else{
		       
		   if (login != null){
			   int found=0;
			   List<Organizer> organizer1 = organizerservice.getorganizerList();
			   for (Organizer record : organizer1){
				    String website=record.getWebsite();
				    String organizerName=record.getOrganizerName();
				    String password=record.getOrganizerPassword() ;
					if (!login.getWebsite().equals(website)||!login.getPassword().equals(password)){
		
					modelandview.addObject("errorMessage","*Invalid login Website or Password");
					found=1;
					}
					else{
						Candidates candidate = new Candidates();
						
						
						
						  HttpSession session=request.getSession(); 
				        session.setAttribute("website",website);  
				        session.setAttribute("organizerName",organizerName);  
						 modelandview = new ModelAndView("customize");
					   	modelandview.addObject("Candidates",candidate);
						 return modelandview;
					}	

				   
			   }
			   if(found==1)
 			   {
				  
				   return modelandview;
				   
			   }
                  modelandview = new ModelAndView("customize");
		   	   return modelandview;
	   }
	  
	  }
	    modelandview = new ModelAndView("customize");
   	   return modelandview;
   }
   
   @RequestMapping(value="/VoterLogin",method=RequestMethod.GET)
	public ModelAndView voter(){
	ModelAndView modelandview = new ModelAndView("Voterlogin");
	modelandview.addObject("welcomeMessage", "my first project");
	
	return modelandview;
}
   @RequestMapping(value="/VoterSubmitLogin", method=RequestMethod.POST)
   public ModelAndView voterLogin(HttpServletRequest request,@Validated @ModelAttribute("VoterLogin") Login VoterLogin, BindingResult result) {
	   ModelAndView modelandview;
	  
	   
	   if(result.hasErrors()){
		   modelandview=new ModelAndView("VoterLogin");	
			    modelandview.addObject("errorMessage","*Error in login please check enetered fields type");
			
	   }
	   else{
		       
		   	if (VoterLogin != null){
		   		System.out.println("hoola");
			      List<Voter> voter1 = voterservice.getvoterList();
			      for (Voter record : voter1){
			    	  			long electoralId=record.getElectoralId();
			    	  			String name=record.getName();
			    	  			String website=record.getWebsite();
			    	  			String password=record.getPassword() ;
			    	  			System.out.println("start website:"+website);
			    	  			if (VoterLogin.getElectoralId()!=electoralId||!VoterLogin.getPassword().equals(password)){
			    	  				modelandview=new ModelAndView("VoterLogin");	
			    	  					modelandview.addObject("errorMessage","*Invalid login website and password");
			    	  					
			    	  			}
			    	  			else{
						
			    	  					if(record.getVoted()==1){
			    	  						modelandview=new ModelAndView("VoterLogin");	
			    	  							modelandview.addObject("errorMessage","*Already voted");
			    	  							return modelandview;
			    	  					     }
			    	  					DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			    	  					DateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
			    	  					Date currentdate=new Date(); 
			    	  					HttpSession session=request.getSession(); 
			    	  					session.setAttribute("ElectoralId",electoralId);  
			    	  					session.setAttribute("Name",name);  
			    	  					session.setAttribute("Website",website);
					        
			    	  					List<WebsiteCustomize> customize = websitecustomizeservice.getwebsitedetailList();
			    	  					for(WebsiteCustomize record2 : customize){
			    	  								if(website.equals(record2.getWebsite())){
			    	  									System.out.println("hoola");
			    	  									            String date=sdf.format(record2.getVotingDate());
			    	  												String starttime=sdf1.format(record2.getVoteStartTime());
			    	  												String finsihtime=sdf1.format(record2.getVoteFinishTime());					
			    	  												System.out.println("current: "+sdf.format(currentdate));
			    	  												if(date.compareToIgnoreCase(sdf.format(currentdate))>=0){
			    	  													System.out.println("hoola");
			    	  														if(finsihtime.compareToIgnoreCase(sdf1.format(currentdate))>=0&&(starttime.compareToIgnoreCase(sdf1.format(currentdate))<=0)){
			    	  																List<Candidate> candidate1 = candidateservice.getCandidate(website);
			    	  																modelandview = new ModelAndView("voting");
			    	  																for (Candidate record1 : candidate1){
			    	  																	System.out.println("record website:"+record1.getWebsite());
			    	  																	System.out.println("website:"+website);
			    	  																			if(record1.getWebsite().equals(website)){
			    	  																				System.out.println("hoola");
			    	  																				List<Candidate> candidate2 = candidateservice.getCandidate(website);
			    	  																				modelandview.addObject("candidate1",candidate2);  
			    	  																				return modelandview;
					        	  						
			    	  																						}
			    	  																				else{
			    	  																							modelandview.addObject("message","No Candidates");
			    	  																							return modelandview;
			    	  																					}
			    	  																				}
			    	  																		}
			    	  														else{
				    	  														modelandview=new ModelAndView("VoterLogin");
				    	  														modelandview.addObject("errorMessage","Voting time finished or not start");
				    	  														return modelandview;
				    	  												}	
			    	  															}
			    	  												else{
			    	  														modelandview=new ModelAndView("VoterLogin");
			    	  														modelandview.addObject("errorMessage","Voting has been Closed");
			    	  														return modelandview;
			    	  												}
			    	  								}
			    	  					}	 
						 
			    	  			}	
	 
			      	}
			   
		   }
		   else{
			   modelandview=new ModelAndView("VoterLogin");	
				modelandview.addObject("errorMessage","*Error in data binding");
				return modelandview;
			   
		   }
	   }
	   modelandview=new ModelAndView("VoterLogin");	
	   modelandview.addObject("errorMessage","*no idea");
	   	   return modelandview;
   
}
   
   @RequestMapping("/logout")
   public ModelAndView logout(HttpSession session ) {
      session.invalidate();
      ModelAndView modelandview=new ModelAndView("login");
      modelandview.addObject("logout","You logged out successfully");
      return modelandview;
   }

   @RequestMapping("/voterlogout")
   public ModelAndView voterlogout(HttpSession session ) {
      session.invalidate();
      ModelAndView modelandview=new ModelAndView("VoterLogin");
      modelandview.addObject("logout","You logged out successfully");
      return modelandview;
   }
   @RequestMapping(value="/SubmitCustomize",method=RequestMethod.POST)
   public ModelAndView submitcustomize(HttpServletRequest request,@ModelAttribute("websitecustomize") WebsiteCustomize websitecustomize, BindingResult result) {
	  
	   ModelAndView modelandview;
	   modelandview=new ModelAndView("customize");	
	   if(result.hasErrors()){
		
			    modelandview.addObject("errorMessage","*Check your Entered input");
			
	   }
	   else{
		       
		   if (websitecustomize != null){
			   HttpSession session=request.getSession(); 
			   if (session != null) {
				   
			   }
			   websitecustomizeservice.insertData(websitecustomize);
			   modelandview=new ModelAndView("candidate");
			   return modelandview;
					
			   }
			   else
			   {
				   
				   modelandview=new ModelAndView("customize");	
				   
			   }
		 		        					    				
			   }
	   	   return modelandview;
}
   
   @RequestMapping(value="/SubmitCandidate",method=RequestMethod.POST)
   public ModelAndView submitcandidate(HttpServletRequest request,@ModelAttribute("candidate") Candidates candidate, BindingResult result) {
	  
	   ModelAndView modelandview;
	   modelandview=new ModelAndView("candidate");	
	   if(result.hasErrors()){
		
			    modelandview.addObject("errorMessage","*Candidate not submitted");
			
	   }
	   else{
		       
		   if (candidate != null){
			   HttpSession session=request.getSession(); 
			   if (session != null) {
				   
			   }
			   
			Iterator<Candidate> itr=(candidate.getCandidate()).iterator();
			   while(itr.hasNext()){
			   candidateservice.insertCandidate(itr.next());
			   }
			   modelandview=new ModelAndView("login");
			   modelandview.addObject("customize","You Successfully customize the website");
			   return modelandview;
					
			   }
			   else
			   {
				   
				   modelandview=new ModelAndView("candidate");	
				   
			   }
		 		        					    				
			   }
	   	   return modelandview;
}
}