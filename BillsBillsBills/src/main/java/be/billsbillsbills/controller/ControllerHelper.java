package be.billsbillsbills.controller;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.io.IOUtils;
import org.springframework.web.multipart.MultipartFile;

import be.billsbillsbills.service.UploadService;

public class ControllerHelper {

	public void createDirectory(String directoryString) {
		// Ophalen van het tomcat path & aanmaken image folder indien deze niet
		// bestaat
		String directoryStringEscaped = directoryString.replace("\\", "/");
		File directory = new File(directoryStringEscaped);
		
		System.out.println("ESCAPED: " + directoryStringEscaped);
		System.out.println(directory.exists());

		if (!directory.exists()) {
			directory.mkdirs();
		}
	}

	public void uploadImage(String directoryString, MultipartFile file,
			UploadService uploadService) {

		OutputStream outputStream = null;

		try {
			if (!file.isEmpty()) {

				byte[] byteArr = file.getBytes();
				InputStream inputStream = new ByteArrayInputStream(byteArr);

				String link = directoryString + file.getOriginalFilename();
				uploadService.storeImage(file.getOriginalFilename());

				outputStream = new FileOutputStream(new File(link));

				int read = 0;
				byte[] bytes = new byte[1024];

				while ((read = inputStream.read(bytes)) != -1) {
					outputStream.write(bytes, 0, read);
				}

			}
			outputStream.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			IOUtils.closeQuietly(outputStream);
		}
	}
}
