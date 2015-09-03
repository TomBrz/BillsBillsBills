package be.spring.controller;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import be.spring.service.UploadService;
import be.spring.service.UploadServiceImpl;

@Controller
@RequestMapping("/Testing")
public class UploadController {

	@Autowired
	private UploadService uploadService;

	@RequestMapping(method = RequestMethod.GET)
	public String handleForm() {
		System.out.println("Get");
		return "form_test";
	}

	@ModelAttribute("imageurl")
	public String getImage() {
		String imageUrl = uploadService.findImage();
		return imageUrl;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String handleFormUpload(@RequestParam("image") MultipartFile file)
			throws IOException {
		System.out.println("POST");

		// Ophalen van de tomcat path & aanmaken image folder indien deze niet
		// bestaat
		String directoryString = System.getenv("TOMCAT_HOME") + "images\\";
		// System.out.println(System.getenv("TOMCAT_HOME") + "images/");
		String directoryStringEscaped = directoryString.replace("\\", "/");
		// System.out.println(directoryStringEscaped);
		File directory = new File(directoryStringEscaped);

		if (!directory.exists()) {
			directory.mkdir();
		}

		// Wegschrijven van de afbeelding naar de image folder
		if (!file.isEmpty()) {

			byte[] byteArr = file.getBytes();
			InputStream inputStream = new ByteArrayInputStream(byteArr);

			String link = directoryString + file.getOriginalFilename();
			// System.out.println(link);

			// TESTING
			System.out.println("TESTINGTESTING");
			uploadService.storeImage(link);

			OutputStream outputStream = new FileOutputStream(new File(link));

			int read = 0;
			byte[] bytes = new byte[1024];

			while ((read = inputStream.read(bytes)) != -1) {
				outputStream.write(bytes, 0, read);
			}
			outputStream.close();
		}
		return "uploadtest";
	}

}