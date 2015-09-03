package be.billsbillsbills.controller;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/Testing")
public class UploadController {

	@RequestMapping(method = RequestMethod.GET)
	public String handleForm() {
		System.out.println("Get");
		return "form_test";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String handleFormUpload(@RequestParam("image") MultipartFile file)
			throws IOException {
		System.out.println("POST");
		System.out.println("C:/Users/sepped/Pictures/Spring"
				+ file.getOriginalFilename());
		if (!file.isEmpty()) {
			System.out.println("NOT EMPTY");
			BufferedImage src = ImageIO.read(new ByteArrayInputStream(file
					.getBytes()));
			File destination = new File("C:/Users/sepped/Pictures/Spring/"
					+ file.getOriginalFilename());
			ImageIO.write(src, "png", destination);
		}
		return "uploadtest";
	}
}
