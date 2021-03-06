package be.billsbillsbills.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import be.billsbillsbills.service.UploadService;

@Controller
@RequestMapping("/upload")
public class UploadController {

	ControllerHelper helper = new ControllerHelper();

	@Autowired
	private UploadService uploadService;

	@RequestMapping(method = RequestMethod.GET)
	public String handleForm() {
		System.out.println("Get");
		return "form_test";
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView handleFormUpload(
			@RequestParam("image") MultipartFile file,
			HttpServletRequest request) throws IOException {
		System.out.println("POST");


//		ServletContext context = RequestContextUtils.getWebApplicationContext(
//				request).getServletContext();
//		String directoryString = context.getRealPath("/") + "\\resources\\images\\";
		
		
		String tomcatHome = System.getenv("TOMCAT_HOME");
		String directoryString = tomcatHome + "webapps/resources/images/";
		System.out.println(directoryString);
		

		helper.createDirectory(directoryString);
//		helper.uploadImage(directoryString, file, uploadService);

		return new ModelAndView("uploadtest", "imageurl",
				uploadService.findImage());
	}

}