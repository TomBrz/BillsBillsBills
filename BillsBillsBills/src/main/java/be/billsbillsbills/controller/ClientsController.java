package be.billsbillsbills.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import be.billsbillsbills.entities.Client;
import be.billsbillsbills.entities.ClientCommand;
import be.billsbillsbills.service.StorageService;

@Controller
@RequestMapping("/clients")
public class ClientsController {
	@Autowired
	private StorageService storageService;
	
	@RequestMapping(method=RequestMethod.POST)
	public String handlePost(Client client){
		storageService.storeClients(client);
		return "redirect:invoices.htm";
	}
	

}
