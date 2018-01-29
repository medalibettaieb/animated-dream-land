package tn.bettaieb.dream_land.services.greetings;

import javax.ejb.Remote;

@Remote
public interface GreetingsServiceRemote {
	String sayHello(String name);
}
