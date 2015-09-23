package be.billsbillsbills.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import be.billsbillsbills.entities.Record_In;
import be.billsbillsbills.service.HelperService;
import be.billsbillsbills.service.RetrievalService;
import be.billsbillsbills.service.StorageService;
import be.billsbillsbills.service.StorageServiceImpl;

@Controller
@RequestMapping("/invoices")
public class InvoicesController {
	
	@Autowired
	private HelperService service;
	
	@Autowired
	private StorageService storageService;
	
	@Autowired
	private ControllerHelper helper;
	
	@Autowired
	private RetrievalService retrievalService;

	@RequestMapping(method=RequestMethod.GET)
	private ModelAndView handleGet(){
		List<Record_In> list = retrievalService.getRecordsIn();
		
		return new ModelAndView("invoices", "invoicesList", list);
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	private String handlePost(@RequestParam("invoice_number")String invoiceNumber, @RequestParam("client") String client, @RequestParam("amount") String amount, @RequestParam("file") MultipartFile file) throws IOException{
		String tomcatHome = System.getenv("TOMCAT_HOME");
		String directoryString = tomcatHome + "/webapps/resources/images/";
		System.out.println(directoryString);
		

		helper.createDirectory(directoryString);
		helper.uploadImage(directoryString, file);
		
		System.out.println(invoiceNumber + " " + client + " " + amount);
		Record_In record= new Record_In();
		record.setDescription(client);
		record.setInvoiceNumber(invoiceNumber);
		record.setUrl(directoryString + file.getOriginalFilename());
		
		storageService.storeDetails(record);
		return "redirect:invoices.htm";
	}

}
