package tn.bettaieb.dream_land.services.greetings;

import javax.ejb.Stateless;

@Stateless
public class GreetingsService implements GreetingsServiceRemote, GreetingsServiceLocal {

	@Override
	public String sayHello(String name) {
		return "hello Mr/Ms : " + name;
	}

}
