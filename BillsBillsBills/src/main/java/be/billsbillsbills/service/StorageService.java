package be.billsbillsbills.service;

import be.billsbillsbills.entities.Client;
import be.billsbillsbills.entities.Record_In;

public interface StorageService {
	public void storeDetails(Record_In record);
	
	public void storeClients(Client client);

}
