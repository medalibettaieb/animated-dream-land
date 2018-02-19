package tn.bettaieb.dream_land.training.inheritence;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import tn.bettaieb.dream_land.training.inheritence.Animal;

/**
 * Entity implementation class for Entity: Cat
 *
 */
@Entity

public class Cat extends Animal implements Serializable {

	
	private String color;
	private static final long serialVersionUID = 1L;

	public Cat() {
		super();
	}   
	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}
   
}
