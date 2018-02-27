package tn.bettaieb.dream_land.services;

import javax.ejb.Local;

import tn.bettaieb.dream_land.entities.Equipement;
import tn.bettaieb.dream_land.utilities.IGenericDAO;

@Local
public interface EquipementServiceLocal extends IGenericDAO<Equipement> {

}
