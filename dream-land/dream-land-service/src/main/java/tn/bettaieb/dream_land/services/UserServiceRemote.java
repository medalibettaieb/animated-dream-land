package tn.bettaieb.dream_land.services;

import javax.ejb.Remote;

import tn.bettaieb.dream_land.entities.User;
import tn.bettaieb.dream_land.utilities.IGenericDAO;

@Remote
public interface UserServiceRemote extends IGenericDAO<User> {

}
