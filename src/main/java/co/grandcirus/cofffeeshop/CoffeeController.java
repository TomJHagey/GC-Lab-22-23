  package co.grandcirus.cofffeeshop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeController {

	@Autowired
	UserDao userDao;

	@Autowired
	private ItemDao itemDao;

	@RequestMapping("/")
	public ModelAndView list() {
		List<Item> ListOfItems = itemDao.findAll();
		return new ModelAndView("index", "items", ListOfItems);
	}

	@RequestMapping("/requestForm")
	public ModelAndView showDoForm() {
		return new ModelAndView("register-form");
	}

	@RequestMapping("/registerForm")
	public ModelAndView doForm(User user) {
		ModelAndView mav = new ModelAndView("result-form");
		mav.addObject("user", user);
		userDao.create(user);
		return mav;

	}

	@RequestMapping("/addForm")
	public ModelAndView showAddForm() {
		return new ModelAndView("itemAdd-form");
	}
	
	@RequestMapping("/admin")
	public ModelAndView showAdminForm() {
		List<Item> ListOfItems = itemDao.findAll();
		return new ModelAndView("admin-form", "items", ListOfItems);
	}

	@RequestMapping("/itemAddForm")
	public ModelAndView additemForm(Item item) {
		ModelAndView mav = new ModelAndView("redirect:/admin");
		mav.addObject("item", item);
		itemDao.create(item);
		return mav;
	}

	@RequestMapping("/itemEditForm")
	public ModelAndView edititemForm(@RequestParam("id") Long id) {
		ModelAndView mav = new ModelAndView("item-edit");
		mav.addObject("item", itemDao.findById(id));
		return mav;
	}

	@PostMapping("/itemEditForm")
	public ModelAndView submitEditForm(Item item) {
		itemDao.update(item);
		return new ModelAndView("redirect:/admin");
	}

	@RequestMapping("/deleteItemForm")
	public ModelAndView deleteItemForm(@RequestParam("id") Long id) {
		itemDao.delete(id);
		ModelAndView mav = new ModelAndView("redirect:/admin");
		return mav;
	}

}
