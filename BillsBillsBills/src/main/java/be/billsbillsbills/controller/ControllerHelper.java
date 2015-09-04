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

		if (!directory.exists()) {
			directory.mkdir();
		}
	}

	public String getImageLink(String directoryString, MultipartFile file) {
		String link = directoryString + file.getOriginalFilename();
		return link;
	}

	public void uploadImage(String directoryString, MultipartFile file,
			UploadService uploadService) {

		OutputStream outputStream = null;

		try {
			if (!file.isEmpty()) {

				byte[] byteArr = file.getBytes();
				InputStream inputStream = new ByteArrayInputStream(byteArr);

				String link = getImageLink(directoryString, file);
				uploadService.storeImage(link);

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
