package tn.bettaieb.dream_land.training.inheritence;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Entity implementation class for Entity: Animal
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Animal implements Serializable {

	   
	@Id
	private int idAnimal;
	private String name;
	private static final long serialVersionUID = 1L;

	public Animal() {
		super();
	}   
	public int getIdAnimal() {
		return this.idAnimal;
	}

	public void setIdAnimal(int idAnimal) {
		this.idAnimal = idAnimal;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
   
}
