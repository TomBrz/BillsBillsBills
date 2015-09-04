package be.billsbillsbills.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Service;

import be.billsbillsbills.entities.Record_In;

@Service
public class UploadServiceImpl implements UploadService {

	private EntityManagerFactory emf;

	@PersistenceUnit
	public void setEntityManagerFactory(EntityManagerFactory emf) {
		this.emf = emf;
	}

	@Override
	public void storeImage(String link) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		Record_In recordIn = new Record_In();
		recordIn.setUrl(link);

		em.persist(recordIn);

		tx.commit();
		em.close();
	}

	@Override
	public String findImage() {

		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		Record_In recordIn = em.find(Record_In.class, 1L);

		tx.commit();
		em.close();

		if (recordIn == null) {
			return null;
		} else {
			return recordIn.getUrl();
		}
	}

}
