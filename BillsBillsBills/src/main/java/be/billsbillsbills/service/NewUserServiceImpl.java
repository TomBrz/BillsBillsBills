package be.billsbillsbills.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import org.springframework.transaction.annotation.Transactional;

import be.billsbillsbills.entities.User;

public class NewUserServiceImpl implements NewUserService {
	
	private EntityManager em;
	
	@PersistenceContext
	private void setEntityManager(EntityManager em){
		this.em=em;
	}

	
	@Transactional
	@Override
	public void storeUser(User user) {


		em.persist(user);


	}

}
