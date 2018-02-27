package tn.bettaieb.dream_land.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Amusement
 *
 */
@Entity

public class Amusement implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;

	@OneToMany(mappedBy = "amusement", cascade = CascadeType.MERGE)
	private List<Equipement> equipements;

	@OneToMany(mappedBy = "amusement")
	private List<ShiftDetail> shiftDetails;
	private static final long serialVersionUID = 1L;

	public Amusement() {
		super();
	}

	public Amusement(String name) {
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

	public void linkEquipementsToThisAmusement(List<Equipement> equipements) {
		this.equipements = equipements;
		for (Equipement e : equipements) {
			e.setAmusement(this);
		}
	}
}
