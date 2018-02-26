package training.services;

import java.util.List;

import javax.ejb.Local;

import tn.bettaieb.dream_land.entities.training.Product;

@Local
public interface ProductServiceLocal {
	void addProduct(Product product);

	void updateProduct(Product product);

	void deleteProductById(int id);

	void deleteProduct(Product product);

	Product findProductById(int id);

	List<Product> findAllProducts();
}
