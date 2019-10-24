package testClient;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.entities.Personnel;
import tn.esprit.entities.Poste;
import tn.esprit.service.PersonnelServiceRemote;

public class TestAjout {

	public static void main(String[] args) throws NamingException, ParseException {
		// TODO Auto-generated method stub
		InitialContext cx= new InitialContext();
		Object obj= cx.lookup("/test-ear/test-ejb/PersonnelService!tn.esprit.service.PersonnelServiceRemote");
		
		PersonnelServiceRemote proxy= (PersonnelServiceRemote) obj;
		
		Personnel p1= new Personnel();
		p1.setNom("Ammar");
		p1.setPrenom("Med");
		p1.setAge(35);
		SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyyy");
		Date dd=df.parse("02/05/2015");
		p1.setDateDeRecrutement(dd);
		p1.setLogin("Med");
		p1.setPassword("Med");
		p1.setPoste(Poste.Responsable);
		
		Personnel p2= new Personnel();
		p2.setNom("Omar");
		p2.setPrenom("Ahmed");
		p2.setAge(32);
		
		Date dd2=df.parse("01/05/2017");
		p2.setDateDeRecrutement(dd2);
		p2.setLogin("Ahmed");
		p2.setPassword("Ahmed");
		p2.setPoste(Poste.Garde_Jour);
		
		Personnel p3= new Personnel();
		p3.setNom("Khammesi");
		p3.setPrenom("Firas");
		p3.setAge(30);
		
		Date dd3=df.parse("02/08/2017");
		p3.setDateDeRecrutement(dd3);
		p3.setLogin("Firas");
		p3.setPassword("Firas");
		p3.setPoste(Poste.Garde_Jour);
		
		Personnel p4= new Personnel();
		p4.setNom("Hamed");
		p4.setPrenom("Houssem");
		p4.setAge(28);
		
		Date dd4=df.parse("22/06/2018");
		p4.setDateDeRecrutement(dd3);
		p4.setLogin("Hamed");
		p4.setPassword("Hamed");
		p4.setPoste(Poste.Garde_Nuit);
		
		proxy.ajouterPersonnel(p1);
		proxy.ajouterPersonnel(p2);
		proxy.ajouterPersonnel(p3);
		proxy.ajouterPersonnel(p4);
	}
	

}
