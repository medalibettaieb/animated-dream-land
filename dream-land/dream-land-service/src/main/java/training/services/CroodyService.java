package training.services;

import javax.ejb.Stateless;

import tn.bettaieb.dream_land.entities.training.Croudy;
import tn.bettaieb.dream_land.utilities.GenericDAO;

/**
 * Session Bean implementation class CroodyService
 */
@Stateless
public class CroodyService extends GenericDAO<Croudy> implements CroodyServiceRemote, CroodyServiceLocal {

	/**
	 * Default constructor.
	 */
	public CroodyService() {
		super(Croudy.class);
	}

}
