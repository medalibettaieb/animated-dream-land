package tn.bettaieb.dream_land.app.client.gui.productTests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.bettaieb.dream_land.entities.training.Product;
import training.services.ProductServiceRemote;

public class TestAddProduct {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		ProductServiceRemote productServiceRemote = (ProductServiceRemote) context
				.lookup("dream-land-ear/dream-land-service/ProductService!training.services.ProductServiceRemote");

		Product product = new Product("P1", 100D);

		productServiceRemote.addProduct(product);

	}

}
