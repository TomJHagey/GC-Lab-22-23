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
	public Item findById(Long id) {
		return em.find(Item.class, id);
	}

	public void create(Item item) {
		em.persist(item);
	}
	
	public void update(Item item) {
		em.merge(item);
	}
	
	public void delete(Long id) {
		em.remove(em.getReference(Item.class, id));
	}
}