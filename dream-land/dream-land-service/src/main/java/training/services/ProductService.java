package training.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.bettaieb.dream_land.entities.training.Product;

/**
 * Session Bean implementation class ProductService
 */
@Stateless
public class ProductService implements ProductServiceRemote, ProductServiceLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public ProductService() {
	}

	@Override
	public void addProduct(Product product) {
		entityManager.persist(product);

	}

	@Override
	public void updateProduct(Product product) {
		entityManager.merge(product);

	}

	@Override
	public void deleteProductById(int id) {
		entityManager.remove(findProductById(id));

	}

	@Override
	public void deleteProduct(Product product) {
		entityManager.remove(entityManager.merge(product));

	}

	@Override
	public Product findProductById(int id) {
		return entityManager.find(Product.class, id);
	}

	@Override
	public List<Product> findAllProducts() {
		String jpql = "SELECT p FROM Product p";
		return entityManager.createQuery(jpql).getResultList();
	}

}
