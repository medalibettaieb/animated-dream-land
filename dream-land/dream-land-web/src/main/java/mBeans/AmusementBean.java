package mBeans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import tn.bettaieb.dream_land.entities.Amusement;
import tn.bettaieb.dream_land.entities.Equipement;
import tn.bettaieb.dream_land.services.AmusementServiceLocal;
import tn.bettaieb.dream_land.services.EquipementServiceLocal;

@ManagedBean
@ViewScoped
public class AmusementBean {
	private List<Amusement> amusements;
	private Amusement amusement;
	private boolean showForm;
	private int idOfEquipement;
	@EJB
	private AmusementServiceLocal amusementServiceLocal;
	@EJB
	private EquipementServiceLocal equipementServiceLocal;

	@PostConstruct
	private void init() {
		amusement = new Amusement();
		amusements = new ArrayList<>();
		showForm = false;
	}

	public void doSelect() {
		showForm = true;
	}

	public void doCancel() {
		showForm = false;
	}

	public void doAddAmusemnt() {
		if (idOfEquipement != 0) {
			List<Equipement> equipements = new ArrayList<>();
			equipements.add(equipementServiceLocal.find(idOfEquipement));
			amusement.linkEquipementsToThisAmusement(equipements);
			amusementServiceLocal.update(amusement);
		} else {
			amusementServiceLocal.update(amusement);
		}

		showForm = false;

	}

	public void doDeleteAmusemnt() {
		amusementServiceLocal.delete(amusement);
		amusements = amusementServiceLocal.findAll();
		showForm = false;
	}

	public List<Amusement> getAmusements() {
		amusements = amusementServiceLocal.findAll();
		return amusements;
	}

	public void setAmusements(List<Amusement> amusements) {
		this.amusements = amusements;
	}

	public Amusement getAmusement() {
		return amusement;
	}

	public void setAmusement(Amusement amusement) {
		this.amusement = amusement;
	}

	public boolean isShowForm() {
		return showForm;
	}

	public void setShowForm(boolean showForm) {
		this.showForm = showForm;
	}

	public int getIdOfEquipement() {
		return idOfEquipement;
	}

	public void setIdOfEquipement(int idOfEquipement) {
		this.idOfEquipement = idOfEquipement;
	}

}
