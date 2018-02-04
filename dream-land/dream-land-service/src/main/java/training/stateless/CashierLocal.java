package training.stateless;

import java.util.List;
import java.util.Map;

import javax.ejb.Local;

import training.Product;

@Local
public interface CashierLocal {
	Map<Double, Double> validatePurshase(List<Product> products);
}
