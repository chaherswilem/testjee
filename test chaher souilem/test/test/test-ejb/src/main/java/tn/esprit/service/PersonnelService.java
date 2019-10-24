package tn.esprit.service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.entities.Parking;
import tn.esprit.entities.Personnel;
import tn.esprit.entities.Zone;

/**
 * Session Bean implementation class PersonnelService
 */
@Stateless
@LocalBean
public class PersonnelService implements PersonnelServiceRemote, PersonnelServiceLocal {

	 @PersistenceContext
	    EntityManager em;
    /**
     * Default constructor. 
     */
    public PersonnelService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void ajouterPersonnel(Personnel personnel) {
		em.persist(personnel);
		
	}

	@Override
	public void ajoutParkingetZones(Parking parking, List<Zone> listeZones) {
		// TODO Auto-generated method stub
		parking.setZones(listeZones);
		em.persist(parking);
		
	}

}
