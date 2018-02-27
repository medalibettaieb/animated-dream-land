package tn.bettaieb.dream_land.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Pack
 *
 */
@Entity

public class Pack implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@ManyToMany
	private List<Amusement> amusements;
	
	@ManyToMany
	private List<User> costomers;
	private static final long serialVersionUID = 1L;

	public Pack() {
		super();
	}   
	
	public Pack(String name) {
		super();
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Amusement> getAmusements() {
		return amusements;
	}

	public void setAmusements(List<Amusement> amusements) {
		this.amusements = amusements;
	}

	public List<User> getCostomers() {
		return costomers;
	}

	public void setCostomers(List<User> costomers) {
		this.costomers = costomers;
	}
   
}
