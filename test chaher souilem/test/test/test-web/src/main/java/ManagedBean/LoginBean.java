package ManagedBean;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import tn.esprit.entities.Role;
import tn.esprit.entities.User;

import tn.esprit.service.UserService;

@ManagedBean
@SessionScoped
public class LoginBean implements Serializable{

	private String login; private String password; private User user; private Boolean loggedIn;
	@EJB
	UserService userService;
	
	public String doLogin() {
		String navigateTo=null;
		user= userService.getUserByEmailAndPassword(login, password);
		if (user != null && user.getRole()== Role.administrateur) {
			navigateTo="/pages/admin/welcome?faces-redirect=true"; loggedIn=true;}
		else {
			FacesContext.getCurrentInstance().addMessage("form:btn", new FacesMessage("Bad Credentials !"));}
		return navigateTo;
	}
	
	public String doLogout() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "/login?faces-redirect=true";
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Boolean getLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(Boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	
	
	
	
}
