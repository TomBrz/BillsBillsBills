package be.billsbillsbills.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import be.billsbillsbills.entities.Record_In;
import be.billsbillsbills.entities.User;

@Service
public class StorageServiceImpl implements StorageService {
	
	@Autowired
	private HelperService helper;
	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void storeDetails(Record_In record){
	String userName = helper.getLoggedInUser();
	TypedQuery<User> query=em.createQuery("select u from User u where name=?1", User.class);
	System.out.println(userName);
	query.setParameter(1, userName);
	User user = query.getSingleResult();
	user.addRecordIn(record);
	
	
	em.persist(record);
	
	
	
		
	}
	
	

}
