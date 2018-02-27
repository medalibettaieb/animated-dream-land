package tn.bettaieb.dream_land.services;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.bettaieb.dream_land.entities.Amusement;
import tn.bettaieb.dream_land.entities.Pack;
import tn.bettaieb.dream_land.entities.User;

/**
 * Session Bean implementation class ReportingService
 */
@Stateless
public class ReportingService implements ReportingServiceRemote, ReportingServiceLocal {
	@PersistenceContext
	private EntityManager entityManager;
	@EJB
	private AmusementServiceLocal amusementServiceLocal;
	@EJB
	private ReportingServiceLocal reportingServiceLocal;
	@EJB
	private PackServiceLocal packServiceLocal;

	/**
	 * Default constructor.
	 */
	public ReportingService() {
	}

	@Override
	public List<User> findUsersByPack(Pack pack) {
		return entityManager.createQuery("SELECT u FROM User u WHERE :param MEMBER OF u.packs")
				.setParameter("param", pack).getResultList();
	}

	@Override
	public List<Pack> findPacksByUser(User user) {
		return entityManager.createQuery("SELECT u FROM Pack u WHERE :param MEMBER OF u.costomers")
				.setParameter("param", user).getResultList();
	}

	@Override
	public List<Amusement> findAmusementByPack(Pack pack) {
		return entityManager.createQuery("SELECT u FROM Amusement u WHERE :param MEMBER OF u.packs")
				.setParameter("param", pack).getResultList();
	}

}
