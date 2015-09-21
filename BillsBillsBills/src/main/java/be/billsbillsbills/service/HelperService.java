package be.billsbillsbills.service;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;


@Service
public class HelperService {

	public String getLoggedInUser() {
		Authentication auth = SecurityContextHolder.getContext()
				.getAuthentication();
		String user = auth.getName();
		return user;
	}
}
