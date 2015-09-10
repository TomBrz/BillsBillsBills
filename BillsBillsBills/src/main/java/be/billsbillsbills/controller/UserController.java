package be.billsbillsbills.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import be.billsbillsbills.entities.Address;
import be.billsbillsbills.entities.User;
import be.billsbillsbills.service.NewUserService;

@Controller
@RequestMapping("/new_user")
public class UserController {

	ControllerHelper helper = new ControllerHelper();

	@Autowired
	private NewUserService newUserService;

	@RequestMapping(method = RequestMethod.GET)
	public String handleGet() {
		return "new_user";
	}

	@RequestMapping(params = "sent")
	public void storeUser(@RequestParam("fname") String firstName,
			@RequestParam("lname") String lastName,
			@RequestParam("email") String email,
			@RequestParam("street") String street,
			@RequestParam("number") String number,
			@RequestParam("po") String pO,
			@RequestParam("postal") String postal,
			@RequestParam("password") String password) {

		Address address = new Address();
		address.setNumber(number);
		address.setpO(pO);
		address.setPostal(postal);
		address.setStreet(street);

		User user = new User();
		user.setName(firstName);
		user.setFamilyName(lastName);
		user.setEmail(email);
		user.setAddress(address);
		user.setRole();
		user.setPassword(password);

		newUserService.storeUser(user);
	}
}
