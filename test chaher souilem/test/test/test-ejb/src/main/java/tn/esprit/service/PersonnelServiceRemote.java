package tn.esprit.service;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.entities.Parking;
import tn.esprit.entities.Personnel;
import tn.esprit.entities.Zone;

@Remote
public interface PersonnelServiceRemote {

	public void ajouterPersonnel(Personnel personnel);
	public void ajoutParkingetZones(Parking parking, List<Zone>listeZones);
}
