package controller.maincontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.services.VoterService;
import com.services.WebsiteCustomizeService;
 
@Controller
public class VoterController{
	@Autowired
    VoterService voterservice;
	@Autowired
    WebsiteCustomizeService websitecustomizeservice;

    String website;
   @RequestMapping(value="/VoterSubmit", method=RequestMethod.POST)
   public ModelAndView inserData(@Validated @ModelAttribute("voter") Voter voter, BindingResult result) {
	   
	   if(result.hasErrors()){
			   ModelAndView modelandview = new ModelAndView("voter");
			   return modelandview;
			
	   }
	   else{
		       
		   if (voter != null){
			   voterservice.insertData(voter);
			   
			   //Voter voteId = voterservice.returnElectoralId(voter.getWebsite(),voter.getName());;
			   long id = 0;
			   //=voteId.getElectoralId();
			   List<Voter> voter1 = voterservice.getvoterList();
			   for (Voter record : voter1){
				   if(record.getWebsite().equals(voter.getWebsite())&&record.getName().equals(voter.getName()));{
					  website=record.getWebsite();
					   id=record.getElectoralId();
				   }
				   
				   System.out.print("website : " + record.getWebsite() );
				   System.out.print(", Name : " + record.getName() );
				   System.out.println(", phone : " + record.getPhone());
			   }
			   ModelAndView modelandview = new ModelAndView("VoterRegister");
               modelandview.addObject("electoralid","Your Electroral Id: "+id);
               modelandview.addObject("Register","You registered successfully");
               modelandview.addObject("website",website);
               return modelandview;
	   }
	  
	  }
	   ModelAndView modelandview = new ModelAndView("VoteSubmit");
   	   return modelandview;
   }

   
}
