package controller.maincontroller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.services.CandidateService;
import com.services.OrganizerService;
import com.services.VoterService;

@Controller
public class VotingController {
	@Autowired
	VoterService voterservice;
	@Autowired
	OrganizerService organizerservice;
	@Autowired
	CandidateService candidateservice;

	   long Id ;
	   long num;
	   String website;

	@RequestMapping(value="/SubmitVoting",method=RequestMethod.POST)
			public ModelAndView voting(HttpServletRequest request,@ModelAttribute("vote") Voting vote, BindingResult result){
		 ModelAndView modelandview;
		 modelandview=new ModelAndView("VoterLogin");
		HttpSession session=request.getSession(); 
		   if (session != null) {
				if (session.getAttribute("ElectoralId") != null) {
					 Id = (Long) session.getAttribute("ElectoralId");
					 website=(String) session.getAttribute("Website");
					
				}
		   }	
	 	
	 		   if(result.hasErrors()){
	 			
	 				    modelandview.addObject("errorMessage","Vote does not record,try again");
	 				
	 		   }
	 		   else{
	 			       
	  			   if (vote != null){  
	 				   String voteCandidate=vote.getVoteCandidate();
	 				  List<Candidate> candidate1 = candidateservice.getcandidateList();
				        for (Candidate record1 : candidate1){
				        	if(voteCandidate.equals(record1.getCandidateName())){
				        	num=record1.getVote();
				        	break;
				        	}
				        }
				        num=num+1;
				        System.out.println("vote:"+num);
				        System.out.println("voteCandidate"+voteCandidate);
				        candidateservice.updateVote(num,voteCandidate,website);
				        
				        List<Voter> vote1=voterservice.getvoterList();
				        for(Voter record2: vote1){
				        	if(Id==record2.getElectoralId()){
				        		short voted=record2.getVoted();
				        		voted=(short) (voted+1);
				        		voterservice.updateVoted(Id,website,voted);
				        		
				        	}
				        }
     	 					modelandview = new ModelAndView("VoteSubmit");	
	 				        modelandview.addObject("website",website);
     	 					modelandview.addObject("votesubmitMessage","Vote recorded successfully");
	 
		
		}
	 		   }
	 			   return modelandview;
	 		   }
	}
	  


	

