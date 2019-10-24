package tn.esprit.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Personnel implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String nom,prenom,login,password;
	private int age;
	private Date dateDeRecrutement;
	@Enumerated
	private Poste poste;
	
	@OneToOne
	private Zone zone;
	
	@ManyToOne
	private Zone zoneG;
	
	public Personnel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Personnel(int id, String nom, String prenom, String login, String password, int age, Date dateDeRecrutement,
			Poste poste) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
		this.age = age;
		this.dateDeRecrutement = dateDeRecrutement;
		this.poste = poste;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDateDeRecrutement() {
		return dateDeRecrutement;
	}
	public void setDateDeRecrutement(Date dateDeRecrutement) {
		this.dateDeRecrutement = dateDeRecrutement;
	}
	public Poste getPoste() {
		return poste;
	}
	public void setPoste(Poste poste) {
		this.poste = poste;
	}
	public Zone getZone() {
		return zone;
	}
	public void setZone(Zone zone) {
		this.zone = zone;
	}
	public Zone getZoneG() {
		return zoneG;
	}
	public void setZoneG(Zone zoneG) {
		this.zoneG = zoneG;
	}
	
	
	
}
