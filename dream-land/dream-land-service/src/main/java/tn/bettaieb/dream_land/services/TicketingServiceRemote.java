package tn.bettaieb.dream_land.services;

import javax.ejb.Remote;

import tn.bettaieb.dream_land.entities.Pack;
import tn.bettaieb.dream_land.entities.User;

@Remote
public interface TicketingServiceRemote {
	void buyPack(Pack pack, User user);
}
