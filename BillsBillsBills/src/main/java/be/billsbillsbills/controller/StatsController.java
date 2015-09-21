package be.billsbillsbills.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import be.billsbillsbills.service.HelperService;

@Controller
@RequestMapping("/stats")
public class StatsController {

	HelperService servive = new HelperService();
	
	@RequestMapping(method = RequestMethod.GET)
	private ModelAndView handleGet() {
		//return "statspage";
		return new ModelAndView("statspage", "user", servive.getLoggedInUser());
	}

}
