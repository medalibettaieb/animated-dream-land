package tn.bettaieb.dream_land.services;

import javax.ejb.Stateless;

import tn.bettaieb.dream_land.entities.Pack;
import tn.bettaieb.dream_land.utilities.GenericDAO;

/**
 * Session Bean implementation class PackService
 */
@Stateless
public class PackService extends GenericDAO<Pack> implements PackServiceRemote, PackServiceLocal {

	/**
	 * Default constructor.
	 */
	public PackService() {
		super(Pack.class);
	}

}
