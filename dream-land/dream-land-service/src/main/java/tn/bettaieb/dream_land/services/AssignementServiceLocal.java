package tn.bettaieb.dream_land.services;

import java.util.Date;

import javax.ejb.Local;

import tn.bettaieb.dream_land.entities.Amusement;
import tn.bettaieb.dream_land.entities.Equipement;
import tn.bettaieb.dream_land.entities.ShiftType;
import tn.bettaieb.dream_land.entities.User;

@Local
public interface AssignementServiceLocal {
	void assignEquipementToAmusement(Equipement equipement, Amusement amusement);

	void scheduleShift(ShiftType shiftType, User user, Amusement amusement, Date shiftDate);

}
