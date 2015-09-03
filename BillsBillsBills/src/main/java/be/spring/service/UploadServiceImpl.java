package be.spring.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import be.spring.entity.Image;

@Repository
public class UploadServiceImpl implements UploadService {

	@Override
	public void storeImage(String link) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("imagedb");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		Image image = new Image();
		image.setLink(link);
		em.persist(image);

		tx.commit();
		em.close();
		emf.close();
	}

	@Override
	public String findImage() {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("imagedb");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		Image image = em.find(Image.class, 3L);

		tx.commit();
		em.close();
		emf.close();

		return image.getLink();
	}

}
