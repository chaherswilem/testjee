package tn.esprit.service;

import javax.ejb.Local;

import tn.esprit.entities.User;

@Local
public interface UserServiceLocal {
	public User getUserByEmailAndPassword(String email,String password);
	public User ajouterUser(User u);

}
