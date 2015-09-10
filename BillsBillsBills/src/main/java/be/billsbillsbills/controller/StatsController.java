package be.billsbillsbills.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import be.billsbillsbills.service.HelperService;

@Controller
@RequestMapping("/stats")
public class StatsController {

	// @RequestMapping(method = RequestMethod.GET)
	// private String handleGet() {
	// return "StatsPage";
	// }

	@RequestMapping(method = RequestMethod.GET)
	private ModelAndView handleGet() {
		HelperService helper = new HelperService();
		return new ModelAndView("StatsPage", "loggedUser", helper.getLoggedInUser());
	}

}
