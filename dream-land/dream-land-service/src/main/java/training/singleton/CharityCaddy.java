package training.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;

import training.Product;
import training.stateless.CashierLocal;

/**
 * Session Bean implementation class CharityCaddy
 */
@Singleton
public class CharityCaddy implements CharityCaddyRemote, CharityCaddyLocal {
	private List<Product> products;
	@EJB
	private CashierLocal cashierLocal;

	@PostConstruct
	private void init() {
		System.out.println("CharityCaddy is alive");
		products = new ArrayList<>();
		System.out.println("size of the list of products = " + products.size());
	}
    /**
     * Default constructor. 
     */
    public CharityCaddy() {
    }
    @Override
	public void addProduct(Product product) {
		products.add(product);
	}

	@Override
	public Map<Double, Double> validate() {
		return cashierLocal.validatePurshase(products);
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
