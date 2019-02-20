package co.grandcirus.cofffeeshop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeController {
	
	@Autowired 
	UserDao userDao;
	
	@Autowired
	private ItemDao itemDao;
	
	@RequestMapping("/")
	public ModelAndView list(){
		List<Item> ListOfItems = itemDao.findAll();
		return new ModelAndView("index", "items", ListOfItems);
	}
	@RequestMapping("/requestForm")
	public ModelAndView showDoForm() {
		return new ModelAndView("register-form");
	}
	@RequestMapping("/addForm")
	public ModelAndView showAddForm() {
		return new ModelAndView("itemAdd-form");
	}
	@RequestMapping("/itemAddForm")
	public ModelAndView additemForm(Item item) {
		ModelAndView mav = new ModelAndView("result-form");
		mav.addObject("item", item);
		itemDao.create(item);
		
		
		return mav;
	}

	@RequestMapping("/registerForm")
	public ModelAndView doForm(User user) {
		ModelAndView mav = new ModelAndView("result-form");
		mav.addObject("user", user);
		userDao.create(user);
		
		
		return mav;

	}
}
