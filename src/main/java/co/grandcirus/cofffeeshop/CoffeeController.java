package co.grandcirus.cofffeeshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcirus.cofffeeshop.dao.UserDao;

@Controller
public class CoffeeController {
	
//	@Autowired 
//	private UserDao userDao;
	
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
	public ModelAndView doForm(Users users) {

		ModelAndView mav = new ModelAndView("result-form");
		mav.addObject("users", users);
		
		//userDao.create(users);
		return mav;

	}
}
