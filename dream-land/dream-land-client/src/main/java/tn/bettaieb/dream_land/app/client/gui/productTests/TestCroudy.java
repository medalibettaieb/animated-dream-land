package tn.bettaieb.dream_land.app.client.gui.productTests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import training.services.CroodyServiceRemote;
import training.services.ProductServiceRemote;

public class TestCroudy {
	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		CroodyServiceRemote croodyServiceRemote=(CroodyServiceRemote) context.lookup("dream-land-ear/dream-land-service/CroodyService!training.services.CroodyServiceRemote");
		
		
	}
}
