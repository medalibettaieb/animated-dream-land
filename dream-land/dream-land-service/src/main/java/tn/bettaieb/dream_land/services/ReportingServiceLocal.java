package tn.bettaieb.dream_land.services;

import java.util.List;

import javax.ejb.Local;

import tn.bettaieb.dream_land.entities.Amusement;
import tn.bettaieb.dream_land.entities.Pack;
import tn.bettaieb.dream_land.entities.User;

@Local
public interface ReportingServiceLocal {
	List<User> findUsersByPack(Pack pack);

	List<Pack> findPacksByUser(User user);

	List<Amusement> findAmusementByPack(Pack pack);
}
