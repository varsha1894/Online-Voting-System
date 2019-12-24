package controller.maincontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class HelloController{
   @RequestMapping("/welcome")
	public ModelAndView hello(){
 		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage", "my first project");
		
		return modelandview;
	}
   
   @RequestMapping("/home")
	public ModelAndView home(){
		ModelAndView model = new ModelAndView("Home");
		model.addObject("welcome", "my first project");
		
		return model;
	} 
}