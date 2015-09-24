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

import be.billsbillsbills.entities.Client;
import be.billsbillsbills.entities.ClientCommand;
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
	public ModelAndView handleGet(){
		List<Record_In> list = retrievalService.getRecordsIn();
		
		return new ModelAndView("invoices", "invoicesList", list);
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String handlePost(@RequestParam("invoice_number")String invoiceNumber, @RequestParam("client") String clientName, @RequestParam("amount") String amount, @RequestParam("file") MultipartFile file) throws IOException{
		String tomcatHome = System.getenv("TOMCAT_HOME");
		String directoryString = tomcatHome + "\\webapps\\resources\\images\\";
		
		
		String directoryStringEscaped = directoryString.replace("\\", "/");
		helper.createDirectory(directoryString);
		helper.uploadImage(directoryString, file);
		
		Client clientObj = new Client();
		clientObj.setName(clientName);
		System.out.println("??????????" + clientName);
		System.out.println("!!!!!!!!!!!" + clientObj.getName());
		
		Record_In record= new Record_In();
		clientObj.addRecordIn(record);
		record.setDescription(clientName);
		record.setAmount(Double.parseDouble(amount));
		record.setInvoiceNumber(invoiceNumber);
		record.setUrl("/resources/images/" + file.getOriginalFilename());
		System.out.println(clientName);
		System.out.println(record.getClient().getName());
		System.out.println(clientObj.getName());
		storageService.storeDetails(record);
		return "redirect:invoices.htm";
	}
	

}
