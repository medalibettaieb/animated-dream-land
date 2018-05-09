package tn.bettaieb.dream_land.services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.bettaieb.dream_land.entities.Amusement;
import tn.bettaieb.dream_land.utilities.GenericDAO;

/**
 * Session Bean implementation class AmusementService
 */
@Stateless
public class AmusementService extends GenericDAO<Amusement> implements AmusementServiceRemote, AmusementServiceLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public AmusementService() {
		super(Amusement.class);
	}

	@Override
	public void addImage(String shortImagePath, Amusement amusement) {
		amusement.setImage(shortImagePath);
		entityManager.merge(amusement);

	}

}
