package be.billsbillsbills.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import be.billsbillsbills.entities.User;

public class NewUserServiceImpl implements NewUserService {

	private EntityManagerFactory emf;

	@PersistenceUnit
	public void setEntityManagerFactory(EntityManagerFactory emf) {
		this.emf = emf;
	}

	@Override
	public void storeUser(User user) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(user);

		tx.commit();
		em.close();
	}

}
