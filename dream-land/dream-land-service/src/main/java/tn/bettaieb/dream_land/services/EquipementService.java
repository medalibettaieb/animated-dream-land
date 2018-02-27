package tn.bettaieb.dream_land.services;

import javax.ejb.Stateless;

import tn.bettaieb.dream_land.entities.Equipement;
import tn.bettaieb.dream_land.utilities.GenericDAO;

/**
 * Session Bean implementation class EquipementService
 */
@Stateless
public class EquipementService extends GenericDAO<Equipement>
		implements EquipementServiceRemote, EquipementServiceLocal {

	/**
	 * Default constructor.
	 */
	public EquipementService() {
		super(Equipement.class);
	}

}
