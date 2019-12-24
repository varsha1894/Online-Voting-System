package controller.maincontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;

import com.services.OrganizerService;

 
@Controller
public class RegisterOrganizer{
	@Autowired
    OrganizerService organizerservice;
   @RequestMapping(value="/organizer",method=RequestMethod.GET)
	public ModelAndView OrganizerForm(){
 		ModelAndView modelandview = new ModelAndView("Organizer");
		modelandview.addObject("welcomeMessage", "my first project");
		
		return modelandview;
	}
   
   @RequestMapping(value="/OrganizerCustomize.html", method=RequestMethod.POST)
   public ModelAndView inserData(@Validated @ModelAttribute("organizer") Organizer organizer, BindingResult result) {
	   
	   if(result.hasErrors()){
			   ModelAndView modelandview = new ModelAndView("Organizer");
			   return modelandview;
			
	   }
	   else{
		       
		   if (organizer != null){
			   organizerservice.insertData(organizer);
			   List<Organizer> organizer1 = organizerservice.getorganizerList();
			   for (Organizer record : organizer1){
				   System.out.print("ID : " + record.getOrganizerName() );
				   System.out.print(", Name : " + record.getOrganization() );
				   System.out.println(", Age : " + record.getWebsite());
			   }
			   
			   ModelAndView modelandview = new ModelAndView("SuccessRegister");
		   	   modelandview.addObject("msg",organizer1);
			   return modelandview;
	   }
	  
	  }
	   ModelAndView modelandview = new ModelAndView("SuccessRegister");
   	   return modelandview;
   }
   @RequestMapping(value="/customize", method=RequestMethod.GET)
   public ModelAndView OrganizerSubmit(){
	
	   ModelAndView modelandview = new ModelAndView("customize");
		return modelandview;
	}

}