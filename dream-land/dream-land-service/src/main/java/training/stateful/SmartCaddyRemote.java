package training.stateful;

import java.util.Map;

import javax.ejb.Remote;

import training.Product;

@Remote
public interface SmartCaddyRemote {
	void addProduct(Product product);

	Map<Double, Double> validate();
}
