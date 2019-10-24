package tn.esprit.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Zone implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String ref;
	private float dimension;
	
	@OneToOne(mappedBy="zone")
	private Personnel personnel;
	
	@OneToMany(mappedBy="zoneG")
	private List<Personnel> personnels;
	
	@ManyToOne
	private Parking parking;
	
	public Zone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Zone(int id, String ref, float dimension) {
		super();
		this.id = id;
		this.ref = ref;
		this.dimension = dimension;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public float getDimension() {
		return dimension;
	}
	public void setDimension(float dimension) {
		this.dimension = dimension;
	}
	public Personnel getPersonnel() {
		return personnel;
	}
	public void setPersonnel(Personnel personnel) {
		this.personnel = personnel;
	}
	public List<Personnel> getPersonnels() {
		return personnels;
	}
	public void setPersonnels(List<Personnel> personnels) {
		this.personnels = personnels;
	}
	
	
	
}
