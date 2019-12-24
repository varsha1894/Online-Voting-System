package controller.maincontroller;


import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.services.CandidateService;
import com.services.OrganizerService;
import com.services.WebsiteCustomizeService;

@Controller
@RequestMapping("/*")
public class DefaultCcontroller {
	
	String url;
	@Autowired
    OrganizerService organizerservice;
	@Autowired
    CandidateService candidateservice;
	@Autowired
	WebsiteCustomizeService websitecustomizeservice;
	@GetMapping("/{urlPattern}")
	   public ModelAndView voterpage(@PathVariable("urlPattern") String url){
		ModelAndView modelandview;
		modelandview=new ModelAndView("HelloPage");
				this.url=url;
		 List<Organizer> organizer1 = organizerservice.getorganizerList();
		   for (Organizer record : organizer1){
			    String website=record.getWebsite();
			   
				if (!url.equals(website)){
	
				modelandview.addObject("welcomeMessage","Invalid website name");
				
				}
				else{
					long max=0;
					String winner = null;
					List<Candidate> candidate1 = candidateservice.getCandidate(url);
					 for (Candidate record1 : candidate1){
						    Long vote=record1.getVote();
					String candidateName=record1.getCandidateName();
					if(max<vote){
						winner=candidateName;
				      max=vote;
					}
				
					
					 }
					 DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
					 DateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
					 Date currentdate=new Date(); 
					 
					 modelandview = new ModelAndView("VoterLogin");
					 modelandview.addObject("url",url);
					 List<WebsiteCustomize> customize = websitecustomizeservice.getwebsitedetailList();
					 for(WebsiteCustomize record2 : customize){
						 
					if(website.equals(record2.getWebsite())){
						  String date=sdf.format(record2.getVotingDate());
						  String time=sdf1.format(record2.getVoteFinishTime());
						 System.out.println("date "+date);
						 System.out.println("current: "+sdf.format(currentdate));
						 if(date.compareToIgnoreCase(sdf.format(currentdate))<=0){
							 if(time.compareToIgnoreCase(sdf1.format(currentdate))<=0){
							 modelandview.addObject("winner",winner); 
							 modelandview.addObject("n",1);
							 return modelandview;
							 }
						 }
						 else{
							 modelandview.addObject("winner","Voting not finished ");
							 return modelandview;
						 }
										 
					 }
					
		
					 }
				   	   return modelandview;
				}	

			   
		   }

		
		return modelandview;
		}

	
	
   @RequestMapping("/voter")
	public ModelAndView hello(){
	  ModelAndView modelandview= new ModelAndView("voter");
	   DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	   DateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
	   Date currentdate=new Date(); 

	   List<WebsiteCustomize> customize = websitecustomizeservice.getwebsitedetailList();
		 for(WebsiteCustomize record2 : customize){
			 if(url.equals(record2.getWebsite())){
				 String date=sdf.format(record2.getVotingDate());
				  String startdate=sdf.format(record2.getStartRegisterDate());
				  String finishdate=sdf.format(record2.getLastRegisterDate());
				  String starttime=sdf1.format(record2.getVoteStartTime());
						  System.out.print("current:"+sdf.format(currentdate));
				  System.out.print("startdate:"+finishdate);
					 if(startdate.compareToIgnoreCase(sdf.format(currentdate))<=0){
						 if(finishdate.compareToIgnoreCase(sdf.format(currentdate))<=0){
							System.out.println("votedate");
						 if(date.compareToIgnoreCase(sdf.format(currentdate))<=0){
							System.out.println("votedate");
							System.out.println("starttime"+starttime);
							System.out.println("time"+sdf1.format(currentdate));
							System.out.println("time"+starttime.compareToIgnoreCase(sdf1.format(currentdate)));
						if(starttime.compareToIgnoreCase(sdf1.format(currentdate))>0&&(date.compareToIgnoreCase(sdf.format(currentdate))==0&&(finishdate.compareToIgnoreCase(sdf.format(currentdate))==0&&(startdate.compareToIgnoreCase(sdf.format(currentdate))==0)))){
							modelandview.addObject("website",url);
							return modelandview;
						}
						else{modelandview = new ModelAndView("VoterLogin");
							modelandview.addObject("welcomeMessage", "my first project");
							modelandview.addObject("errorMessage","*Registration not in function");
							modelandview.addObject("website",url);
							
							return modelandview;
									}
									}
						 }
					 } 
		 }
		 }
			// modelandview.addObject("errorMessage","*Registration not in function");
			modelandview.addObject("website",url);
		return modelandview;
	}
}
