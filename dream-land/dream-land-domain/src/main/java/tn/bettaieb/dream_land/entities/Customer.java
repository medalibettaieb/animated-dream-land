package tn.bettaieb.dream_land.entities;

import java.io.Serializable;
import javax.persistence.*;
import tn.bettaieb.dream_land.entities.User;

/**
 * Entity implementation class for Entity: Customer
 *
 */
@Entity

public class Customer extends User implements Serializable {

	
	private int age;
	private UserGender gender;
	private static final long serialVersionUID = 1L;

	public Customer() {
		super();
	}   
	
	public Customer(String name, String login, String password, int age, UserGender gender) {
		super(name, login, password);
		this.age = age;
		this.gender = gender;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public UserGender getGender() {
		return gender;
	}
	public void setGender(UserGender gender) {
		this.gender = gender;
	}
   
}
