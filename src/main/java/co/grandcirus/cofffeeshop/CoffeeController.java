package co.grandcirus.cofffeeshop;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public ModelAndView doForm(User user, HttpSession session) {
		ModelAndView mav = new ModelAndView("result-form");
		mav.addObject("user", user);
		session.setAttribute("profile", user);
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

	@RequestMapping("/login")
	public ModelAndView showLoginForm() {
		return new ModelAndView("login");
	}

	@PostMapping("/login")

	public ModelAndView submitLoginForm(@RequestParam("username") String username,
			@RequestParam("password") String password, HttpSession session, RedirectAttributes redir) {

		User user = userDao.findByUsername(username);
		if (user == null || !user.getPassword().equals(password)) {
			return new ModelAndView("login", "message", "Incorrect username or password.");
		}
		
		session.setAttribute("profile", user);
		redir.addFlashAttribute("message", "Welcome. Thanks for logging in.");

		return new ModelAndView("redirect:/");
	}

	@RequestMapping("/logout")
	public ModelAndView logout(HttpSession session, RedirectAttributes redir) {
		session.invalidate();
		redir.addFlashAttribute("message", "Logged out.");
		return new ModelAndView("redirect:/");
	}

}
