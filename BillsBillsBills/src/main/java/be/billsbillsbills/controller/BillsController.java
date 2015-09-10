package be.billsbillsbills.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/bills")
public class BillsController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String handleGet(){
		return "bills";
	}
	

}
