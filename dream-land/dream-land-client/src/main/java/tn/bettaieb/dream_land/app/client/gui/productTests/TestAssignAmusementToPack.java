package tn.bettaieb.dream_land.app.client.gui.productTests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.bettaieb.dream_land.entities.Amusement;
import tn.bettaieb.dream_land.entities.Pack;
import tn.bettaieb.dream_land.services.AmusementServiceRemote;
import tn.bettaieb.dream_land.services.AssignementServiceRemote;
import tn.bettaieb.dream_land.services.EquipementServiceRemote;
import tn.bettaieb.dream_land.services.PackServiceRemote;
import tn.bettaieb.dream_land.services.ReportingServiceRemote;
import tn.bettaieb.dream_land.services.TicketingServiceRemote;
import tn.bettaieb.dream_land.services.UserServiceRemote;

public class TestAssignAmusementToPack {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		AssignementServiceRemote assignementServiceRemote = (AssignementServiceRemote) context.lookup(
				"dream-land-ear/dream-land-service/AssignementService!tn.bettaieb.dream_land.services.AssignementServiceRemote");
		EquipementServiceRemote equipementServiceRemote = (EquipementServiceRemote) context.lookup(
				"dream-land-ear/dream-land-service/EquipementService!tn.bettaieb.dream_land.services.EquipementServiceRemote");
		AmusementServiceRemote amusementServiceRemote = (AmusementServiceRemote) context.lookup(
				"dream-land-ear/dream-land-service/AmusementService!tn.bettaieb.dream_land.services.AmusementServiceRemote");
		TicketingServiceRemote ticketingServiceRemote = (TicketingServiceRemote) context.lookup(
				"dream-land-ear/dream-land-service/TicketingService!tn.bettaieb.dream_land.services.TicketingServiceRemote");
		UserServiceRemote userServiceRemote = (UserServiceRemote) context.lookup(
				"dream-land-ear/dream-land-service/UserService!tn.bettaieb.dream_land.services.UserServiceRemote");
		PackServiceRemote packServiceRemote = (PackServiceRemote) context.lookup(
				"dream-land-ear/dream-land-service/PackService!tn.bettaieb.dream_land.services.PackServiceRemote");
		ReportingServiceRemote reportingServiceRemote = (ReportingServiceRemote) context.lookup(
				"dream-land-ear/dream-land-service/ReportingService!tn.bettaieb.dream_land.services.ReportingServiceRemote");
	
	Amusement amusement=amusementServiceRemote.find(1);
	Pack pack=packServiceRemote.find(1);
	assignementServiceRemote.assignAmusementToPack(amusement, pack);
	}

}
