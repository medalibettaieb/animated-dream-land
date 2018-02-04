package training.singleton;

import java.util.Map;

import javax.ejb.Remote;

import training.Product;

@Remote
public interface CharityCaddyRemote {
	void addProduct(Product product);

	Map<Double, Double> validate();
}
