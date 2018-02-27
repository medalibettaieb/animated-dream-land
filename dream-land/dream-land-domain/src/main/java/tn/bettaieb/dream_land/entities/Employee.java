package tn.bettaieb.dream_land.entities;

import java.io.Serializable;
import java.lang.Float;
import javax.persistence.*;
import tn.bettaieb.dream_land.entities.User;

/**
 * Entity implementation class for Entity: Employee
 *
 */
@Entity

public class Employee extends User implements Serializable {

	
	private Float salary;
	private static final long serialVersionUID = 1L;

	public Employee() {
		super();
	}
	
	public Employee(String name, String login, String password, Float salary) {
		super(name, login, password);
		this.salary = salary;
	}

	public Float getSalary() {
		return this.salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}
   
}
