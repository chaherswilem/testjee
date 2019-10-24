package testClient;

import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.entities.Parking;
import tn.esprit.entities.Zone;
import tn.esprit.service.PersonnelServiceRemote;

public class TestAjoutParkingZone {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		InitialContext cx= new InitialContext();
		Object obj= cx.lookup("/test-ear/test-ejb/PersonnelService!tn.esprit.service.PersonnelServiceRemote");
		
		PersonnelServiceRemote proxy= (PersonnelServiceRemote) obj;
		
		Zone z1=new Zone();
		z1.setRef("Z01");
		z1.setDimension((float) 200.3);
		
		Zone z2=new Zone();
		z2.setRef("Z02");
		z2.setDimension((float) 122);
		
		Zone z3=new Zone();
		z3.setRef("Z03");
		z3.setDimension((float) 250.6);
		
		Zone z4=new Zone();
		z4.setRef("Z04");
		z4.setDimension((float) 189.5);
		
		
		
		List<Zone> zones= new ArrayList<Zone>();
		zones.add(z1);
		zones.add(z2);
		zones.add(z3);
		zones.add(z4);
		
		Parking parking=new Parking();
		parking.setDesignation("Géant");
		parking.setAdresse("Mnihla");
		parking.setCapacite(500);
		
		parking.setZones(zones);
		
		proxy.ajoutParkingetZones(parking, zones);
		
		

	}

}
