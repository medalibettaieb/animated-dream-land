package tn.bettaieb.dream_land.services.greetings;

import javax.ejb.Local;

@Local
public interface GreetingsServiceLocal {
	String sayHello(String name);
}
