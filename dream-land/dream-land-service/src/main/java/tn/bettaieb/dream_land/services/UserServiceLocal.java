package tn.bettaieb.dream_land.services;

import javax.ejb.Local;

import tn.bettaieb.dream_land.entities.User;
import tn.bettaieb.dream_land.utilities.IGenericDAO;

@Local
public interface UserServiceLocal extends IGenericDAO<User> {

	User login(String login, String password);

}
