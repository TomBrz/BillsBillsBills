package be.billsbillsbills.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StorageServiceImpl implements StorageService {
	@Autowired
	private HelperService helper;
	
	public void storeDetails(){
	String userName = helper.getLoggedInUser();
	
	
		
	}
	
	

}
