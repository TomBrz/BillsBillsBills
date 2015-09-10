package be.billsbillsbills.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/invoices")
public class InvoicesController {
	
	@RequestMapping(method=RequestMethod.GET)
	private String handleGet() {
		return "invoices";

	}

}
