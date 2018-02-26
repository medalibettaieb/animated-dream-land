package tn.bettaieb.dream_land.app.client.gui.productTests;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.bettaieb.dream_land.entities.training.Product;
import training.services.ProductServiceRemote;

public class TestFindAllProducts {
	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		ProductServiceRemote productServiceRemote = (ProductServiceRemote) context
				.lookup("dream-land-ear/dream-land-service/ProductService!training.services.ProductServiceRemote");
		List<Product> products = productServiceRemote.findAllProducts();
		for (Product p : products) {
			System.out.println(p.getName());
		}

	}
}
