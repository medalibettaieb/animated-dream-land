package tn.bettaieb.dream_land.training.inheritence;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Dog
 *
 */
@Entity

public class Dog extends Animal implements Serializable {

	
	private String race;
	private static final long serialVersionUID = 1L;

	public Dog() {
		super();
	}   
	public String getRace() {
		return this.race;
	}

	public void setRace(String race) {
		this.race = race;
	}
   
}
