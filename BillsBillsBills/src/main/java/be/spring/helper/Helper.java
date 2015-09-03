package be.spring.helper;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Helper {

	public static String getCurrentTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
		Date now = new Date();
		String strDate = sdf.format(now);
		return strDate;
	}
}
