package tn.bettaieb.dream_land.utilities;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import tn.bettaieb.dream_land.entities.Agent;
import tn.bettaieb.dream_land.entities.Amusement;
import tn.bettaieb.dream_land.entities.Employee;
import tn.bettaieb.dream_land.entities.Equipement;
import tn.bettaieb.dream_land.entities.User;
import tn.bettaieb.dream_land.services.AmusementServiceLocal;
import tn.bettaieb.dream_land.services.EquipementServiceLocal;
import tn.bettaieb.dream_land.services.UserServiceLocal;

@Singleton
@Startup
public class DBPopulator {
	@EJB
	private UserServiceLocal userServiceLocal;
	@EJB
	private AmusementServiceLocal amusementServiceLocal;
	@EJB
	private EquipementServiceLocal equipementServiceLocal;

	public DBPopulator() {
	}

	@PostConstruct
	public void init() {
		Equipement equipement = new Equipement("engine");
		Equipement equipement2 = new Equipement("rails");
		Equipement equipement3 = new Equipement("helmet");
		Equipement equipement4 = new Equipement("generator");

		Amusement amusement = new Amusement("roller-coaster");
		Amusement amusement2 = new Amusement("ferris-wheel");

		Employee employee = new Employee("kais", "k", "k", 100F);
		Employee employee2 = new Employee("samah", "s", "s", 600F);
		Employee employee3 = new Employee("tayeb", "t", "t", 50F);

		Agent agent = new Agent("ammous", "a", "a", "high");

		User user = new User("user", "u", "u", "user@bitbox.tn");

		userServiceLocal.update(user);
		userServiceLocal.update(employee);
		userServiceLocal.update(employee2);
		userServiceLocal.update(employee3);
		userServiceLocal.update(agent);

		amusementServiceLocal.update(amusement);
		amusementServiceLocal.update(amusement2);

		equipementServiceLocal.update(equipement);
		equipementServiceLocal.update(equipement2);
		equipementServiceLocal.update(equipement3);
		equipementServiceLocal.update(equipement4);

	}
}
