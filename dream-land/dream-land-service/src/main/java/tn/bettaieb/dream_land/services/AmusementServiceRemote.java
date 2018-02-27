package tn.bettaieb.dream_land.services;

import javax.ejb.Remote;

import tn.bettaieb.dream_land.entities.Amusement;
import tn.bettaieb.dream_land.utilities.IGenericDAO;

@Remote
public interface AmusementServiceRemote extends IGenericDAO<Amusement> {

}
