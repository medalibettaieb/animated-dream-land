package training.stateless;

import java.util.Map;

import javax.ejb.Remote;

import training.Product;

@Remote
public interface ClassicCaddyRemote {
	void addProduct(Product product);

	Map<Double, Double> validate();
}
