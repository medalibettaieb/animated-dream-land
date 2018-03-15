package tn.bettaieb.dream_land.services;

import java.util.Date;

import javax.ejb.Remote;

import tn.bettaieb.dream_land.entities.Amusement;
import tn.bettaieb.dream_land.entities.Equipement;
import tn.bettaieb.dream_land.entities.Pack;
import tn.bettaieb.dream_land.entities.ShiftType;
import tn.bettaieb.dream_land.entities.User;

@Remote
public interface AssignementServiceRemote {
	void assignEquipementToAmusement(Equipement equipement, Amusement amusement);

	void scheduleShift(ShiftType shiftType, User user, Amusement amusement, Date shiftDate);

	void assignAmusementToPack(Amusement amusement, Pack pack);

}
