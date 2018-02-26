package training.services;

import javax.ejb.Remote;

import tn.bettaieb.dream_land.entities.training.Croudy;
import tn.bettaieb.dream_land.utilities.IGenericDAO;

@Remote
public interface CroodyServiceRemote extends IGenericDAO<Croudy> {

}
