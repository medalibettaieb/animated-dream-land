package tn.bettaieb.dream_land.services;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.bettaieb.dream_land.entities.Pack;
import tn.bettaieb.dream_land.entities.User;

/**
 * Session Bean implementation class TicketingService
 */
@Stateless
public class TicketingService implements TicketingServiceRemote, TicketingServiceLocal {
	@PersistenceContext
	private EntityManager entityManager;
	@EJB
	private ReportingServiceLocal reportingServiceLocal;
	@EJB
	private UserServiceLocal userServiceLocal;

	/**
	 * Default constructor.
	 */
	public TicketingService() {
	}

	@Override
	public void buyPack(Pack pack, User user) {
		List<Pack> oldList = reportingServiceLocal.findPacksByUser(user);
		if (!oldList.contains(pack)) {
			oldList.add(pack);
		}
		user.setPacks(oldList);

		userServiceLocal.update(user);

	}

}
