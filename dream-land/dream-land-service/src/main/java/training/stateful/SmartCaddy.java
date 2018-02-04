package training.stateful;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateful;

import training.Product;
import training.stateless.CashierLocal;

/**
 * Session Bean implementation class SmartCaddy
 */
@Stateful
public class SmartCaddy implements SmartCaddyRemote, SmartCaddyLocal {
	private List<Product> products;
	@EJB
	private CashierLocal cashierLocal;

	@PostConstruct
	private void init() {
		System.out.println("SmartCaddy is alive");
		products = new ArrayList<>();
		System.out.println("size of the list of products = " + products.size());
	}

	/**
	 * Default constructor.
	 */
	public SmartCaddy() {
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
