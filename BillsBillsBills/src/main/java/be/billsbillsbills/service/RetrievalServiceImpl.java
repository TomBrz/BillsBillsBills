package be.billsbillsbills.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import be.billsbillsbills.entities.Record_In;
import be.billsbillsbills.entities.User;

@Service
public class RetrievalServiceImpl implements RetrievalService {
	private EntityManager em;
	
	@PersistenceContext
	public void setEntityManager(EntityManager em){
		this.em=em;
	}
	@Autowired
	private HelperService helperService;

	@Transactional
	@Override
	public List<Record_In> getRecordsIn() {
		TypedQuery<User> query = em.createQuery("Select u from User as u where u.name=?1", User.class);
		query.setParameter(1, helperService.getLoggedInUser());
		User user =query.getSingleResult();
		List<Record_In> list = user.getRecordsIn();
		for(Record_In el:list){
			System.out.println(el.getUrl());
		}
		
		return list;
	}
	
	
	
	

}
