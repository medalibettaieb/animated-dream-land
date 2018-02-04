package training.stateless;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;

import training.Product;

/**
 * Session Bean implementation class Cashier
 */
@Stateless
public class Cashier implements CashierRemote, CashierLocal {

	/**
	 * Default constructor.
	 */
	public Cashier() {
	}

	@Override
	public Map<Double, Double> validatePurshase(List<Product> products) {
		Map<Double, Double> bill = new HashMap<>();
		Double sum = 0D;
		for (Product p : products) {
			sum = sum+p.getUnitPrice();
		}
		bill.put(Math.random(), sum);
		return bill;
	}

}
