package tn.bettaieb.dream_land.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.bettaieb.dream_land.entities.Amusement;
import tn.bettaieb.dream_land.entities.Equipement;
import tn.bettaieb.dream_land.entities.Pack;
import tn.bettaieb.dream_land.entities.ShiftType;
import tn.bettaieb.dream_land.entities.User;

/**
 * Session Bean implementation class AssignementService
 */
@Stateless
public class AssignementService implements AssignementServiceRemote, AssignementServiceLocal {
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
	public AssignementService() {
	}

	@Override
	public void assignEquipementToAmusement(Equipement equipement, Amusement amusement) {
		List<Equipement> equipementsOld = amusement.getEquipements();
		if (equipementsOld != null) {
			equipementsOld.add(equipement);
			amusement.linkEquipementsToThisAmusement(equipementsOld);
		} else {
			List<Equipement> newOne = new ArrayList<>();
			newOne.add(equipement);
			amusement.linkEquipementsToThisAmusement(newOne);
		}

		amusementServiceLocal.update(amusement);

	}

	@Override
	public void scheduleShift(ShiftType shiftType, User user, Amusement amusement, Date shiftDate) {

	}

	@Override
	public void assignAmusementToPack(Amusement amusement, Pack pack) {
		List<Amusement> amusements = reportingServiceLocal.findAmusementByPack(pack);
		if (!amusements.contains(amusement)) {
			amusements.add(amusement);
		}
		pack.setAmusements(amusements);
		packServiceLocal.update(pack);

	}

}
