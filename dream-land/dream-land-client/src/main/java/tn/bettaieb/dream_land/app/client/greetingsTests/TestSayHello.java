package tn.bettaieb.dream_land.app.client.greetingsTests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.bettaieb.dream_land.services.greetings.GreetingsServiceRemote;

public class TestSayHello {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();

		GreetingsServiceRemote proxy = (GreetingsServiceRemote) context.lookup(
				"dream-land-ear/dream-land-service/GreetingsService!tn.bettaieb.dream_land.services.greetings.GreetingsServiceRemote");

		System.out.println(proxy.sayHello("same7"));
	}

}
