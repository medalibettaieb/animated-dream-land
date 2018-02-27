package tn.bettaieb.dream_land.services;

import javax.ejb.Local;

import tn.bettaieb.dream_land.entities.Amusement;
import tn.bettaieb.dream_land.utilities.IGenericDAO;

@Local
public interface AmusementServiceLocal extends IGenericDAO<Amusement> {

}
