package co.grandcirus.cofffeeshop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeController {

	@RequestMapping("/")
	public ModelAndView showForm() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	
	@RequestMapping("/requestForm")
	public ModelAndView showDoForm() {
		return new ModelAndView("register-form");
	}
	
	@RequestMapping("/registerForm")
	public ModelAndView doForm( @RequestParam("firstName") String firstName,
								@RequestParam("lastName") String lastName,
								@RequestParam("email") String email,
								@RequestParam("phoneNumber") String phoneNumber,
								@RequestParam("password") String password) {
		String result = firstName;
		
		ModelAndView mav = new ModelAndView("result-form");
		mav.addObject("firstName", firstName);
		mav.addObject("lastName", lastName);
		mav.addObject("email", email);
		mav.addObject("phoneNumber", phoneNumber);
		mav.addObject("password", password);
		return mav;
		
	}
}
