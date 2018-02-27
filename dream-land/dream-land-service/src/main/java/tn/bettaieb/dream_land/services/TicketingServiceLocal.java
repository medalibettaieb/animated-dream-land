package tn.bettaieb.dream_land.services;

import javax.ejb.Local;

import tn.bettaieb.dream_land.entities.Pack;
import tn.bettaieb.dream_land.entities.User;

@Local
public interface TicketingServiceLocal {
	void buyPack(Pack pack, User user);
}
