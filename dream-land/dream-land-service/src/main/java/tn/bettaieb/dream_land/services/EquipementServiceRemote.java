package tn.bettaieb.dream_land.services;

import javax.ejb.Remote;

import tn.bettaieb.dream_land.entities.Equipement;
import tn.bettaieb.dream_land.utilities.IGenericDAO;

@Remote
public interface EquipementServiceRemote extends IGenericDAO<Equipement>{

}
