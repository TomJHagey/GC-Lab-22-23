package co.grandcirus.cofffeeshop;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UserDao {

	@PersistenceContext
	private EntityManager em;

	public void create(User user) {
		em.persist(user);
	}

}
