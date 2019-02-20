package co.grandcirus.cofffeeshop;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ItemDao {

	@PersistenceContext
	private EntityManager em;

	public List<Item> findAll() {
		return em.createQuery("FROM Item", Item.class).getResultList();

	}

	public void create(Item item) {
		em.persist(item);
	}
}