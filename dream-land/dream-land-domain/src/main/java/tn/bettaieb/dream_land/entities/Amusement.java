package tn.bettaieb.dream_land.entities;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PostPersist;

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
	private String uuid;
	private String image;

	@ManyToMany(mappedBy = "amusements")
	private List<Pack> packs;

	@OneToMany(mappedBy = "amusement", cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
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

	public List<Pack> getPacks() {
		return packs;
	}

	public void setPacks(List<Pack> packs) {
		this.packs = packs;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@PostPersist
	private void init() {
		this.uuid = UUID.randomUUID().toString();
	}
}
