package tn.esprit.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import tn.esprit.entities.User;


/**
 * Session Bean implementation class UserService
 */
@Stateless
@LocalBean
public class UserService implements UserServiceRemote, UserServiceLocal {

	 @PersistenceContext
	    EntityManager em;

    /**
     * Default constructor. 
     */
    public UserService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public User getUserByEmailAndPassword(String email, String password) {
		TypedQuery<User> query =
				em.createQuery("SELECT e FROM User WHERE e.email=:email AND e.password=:password",User.class);
		query.setParameter("email", email);
		query.setParameter("password", password);
		User user=null;
		try { user = query.getSingleResult();}
		catch (Exception e){
			System.out.println("Erreur : "+ e);
		}
		return user;
		}
	
	@Override
	public User ajouterUser(User u) {
		em.persist(u);
		return u;
	}

}
