package mBeans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import tn.bettaieb.dream_land.entities.Equipement;
import tn.bettaieb.dream_land.services.EquipementServiceLocal;

@ManagedBean
@ViewScoped
public class EquipementBean {
	@EJB
	private EquipementServiceLocal equipementServiceLocal;

	private Equipement equipement;
	private List<Equipement> equipements;
	private boolean showForm;

	@PostConstruct
	private void init() {
		equipement = new Equipement();
		equipements = equipementServiceLocal.findAll();
		showForm = false;
	}

	public void doSelect() {
		showForm = true;
	}

	public void doCancel() {
		showForm = false;
	}

	public void doAddEquipement() {
		equipementServiceLocal.update(equipement);
		showForm = false;

	}

	public String doDeleteEquipement() {
		equipementServiceLocal.delete(equipement);
		equipements = equipementServiceLocal.findAll();
		showForm = false;
		return "";
	}

	public Equipement getEquipement() {
		return equipement;
	}

	public void setEquipement(Equipement equipement) {
		this.equipement = equipement;
	}

	public List<Equipement> getEquipements() {
		return equipements;
	}

	public void setEquipements(List<Equipement> equipements) {
		this.equipements = equipements;
	}

	public boolean isShowForm() {
		return showForm;
	}

	public void setShowForm(boolean showForm) {
		this.showForm = showForm;
	}

}
