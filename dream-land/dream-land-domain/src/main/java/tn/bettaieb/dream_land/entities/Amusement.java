package tn.bettaieb.dream_land.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Amusement
 *
 */
@Entity

public class Amusement implements Serializable {

	@Id
	private Integer id;
	private String name;

	@OneToMany(mappedBy = "amusement")
	private List<Equipement> equipements;
	
	@OneToMany(mappedBy="amusement")
	private List<ShiftDetail> shiftDetails;
	private static final long serialVersionUID = 1L;

	public Amusement() {
		super();
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

	public List<Equipement> getEquipements() {
		return equipements;
	}

	public void setEquipements(List<Equipement> equipements) {
		this.equipements = equipements;
	}

	public List<ShiftDetail> getShiftDetails() {
		return shiftDetails;
	}

	public void setShiftDetails(List<ShiftDetail> shiftDetails) {
		this.shiftDetails = shiftDetails;
	}

}
