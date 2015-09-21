package be.billsbillsbills.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import be.billsbillsbills.service.HelperService;

@Controller
@RequestMapping("/invoices")
public class InvoicesController {
	
	@Autowired
	private HelperService service;
	
	@RequestMapping(method=RequestMethod.GET)
	private String handleGet() {
		return "invoices";

	}
	
	@RequestMapping(method=RequestMethod.POST)
	private ModelAndView handlePost(){
		
		return new ModelAndView();
	}

}
