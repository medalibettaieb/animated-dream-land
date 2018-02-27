package tn.bettaieb.dream_land.app.client.gui.productTests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.bettaieb.dream_land.entities.Amusement;
import tn.bettaieb.dream_land.entities.Equipement;
import tn.bettaieb.dream_land.services.AmusementServiceRemote;
import tn.bettaieb.dream_land.services.AssignementServiceRemote;
import tn.bettaieb.dream_land.services.EquipementServiceRemote;

public class TestAssignEquipementToAmusement {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		AssignementServiceRemote assignementServiceRemote = (AssignementServiceRemote) context.lookup(
				"dream-land-ear/dream-land-service/AssignementService!tn.bettaieb.dream_land.services.AssignementServiceRemote");
		EquipementServiceRemote equipementServiceRemote = (EquipementServiceRemote) context.lookup(
				"dream-land-ear/dream-land-service/EquipementService!tn.bettaieb.dream_land.services.EquipementServiceRemote");
		AmusementServiceRemote amusementServiceRemote = (AmusementServiceRemote) context.lookup(
				"dream-land-ear/dream-land-service/AmusementService!tn.bettaieb.dream_land.services.AmusementServiceRemote");

		Equipement equipement = equipementServiceRemote.find(1);
		Equipement equipement2 = equipementServiceRemote.find(2);
		Equipement equipement3 = equipementServiceRemote.find(3);
		Equipement equipement4 = equipementServiceRemote.find(4);

		Amusement amusement = amusementServiceRemote.find(1);
		Amusement amusement2 = amusementServiceRemote.find(2);
		assignementServiceRemote.assignEquipementToAmusement(equipement, amusement);
		assignementServiceRemote.assignEquipementToAmusement(equipement2, amusement);
		assignementServiceRemote.assignEquipementToAmusement(equipement3, amusement2);
		assignementServiceRemote.assignEquipementToAmusement(equipement4, amusement2);

	}

}
