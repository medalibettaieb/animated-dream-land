package training.services;

import javax.ejb.Local;

import tn.bettaieb.dream_land.entities.training.Croudy;
import tn.bettaieb.dream_land.utilities.IGenericDAO;

@Local
public interface CroodyServiceLocal extends IGenericDAO<Croudy>  {

}
