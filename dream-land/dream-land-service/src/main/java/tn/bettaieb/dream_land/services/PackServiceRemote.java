package tn.bettaieb.dream_land.services;

import javax.ejb.Remote;

import tn.bettaieb.dream_land.entities.Pack;
import tn.bettaieb.dream_land.utilities.IGenericDAO;

@Remote
public interface PackServiceRemote extends IGenericDAO<Pack>{

}
