package tn.bettaieb.dream_land.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Equipement
 *
 */
@Entity

public class Equipement implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	
	@ManyToOne
	private Amusement amusement;
	private static final long serialVersionUID = 1L;

	public Equipement() {
		super();
	} 
	
	public Equipement(String name) {
		super();
		this.name = name;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Amusement getAmusement() {
		return amusement;
	}
	public void setAmusement(Amusement amusement) {
		this.amusement = amusement;
	}
   
}
