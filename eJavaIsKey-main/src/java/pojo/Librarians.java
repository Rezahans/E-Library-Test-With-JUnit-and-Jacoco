package pojo;
// Generated Oct 9, 2022 1:40:24 PM by Hibernate Tools 4.3.1

import dao.DAOLogin;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import util.SessionUtils;




/**
 * Librarians generated by hbm2java
 */
@ManagedBean(name = "fdwi")
public class Librarians  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String username;
     private String password;
     
     
     public String login_user() {
        DAOLogin uDao = new DAOLogin();
        List<Librarians> us = uDao.getBy(username, password);
        try {
            if (us != null) {
                name = us.get(0).name;
                username = us.get(0).username;
                password = us.get(0).password;
                HttpSession session = SessionUtils.getSession();
		session.setAttribute("sesName", username);
                FacesContext.getCurrentInstance().addMessage(
			null,
			new FacesMessage(FacesMessage.SEVERITY_INFO,
				"WELCOME "+ username,
				"Have a great day :)"));
                return "dash";
            } else{
                
            }
        } catch (Exception e) {
            System.out.println(e);
            FacesContext.getCurrentInstance().addMessage(
			null,
			new FacesMessage(FacesMessage.SEVERITY_ERROR,
				"LOGGIN ERROR:   ",
				"Credentials NOT FOUND!"));
            name = "";
            username = "";
            password = "";
        }
        return "index";
    }
    public String logout() {
	HttpSession session = SessionUtils.getSession();
	session.invalidate();
	return "index";
    }

    public Librarians() {
    }

    public Librarians(String name, String username, String password) {
       this.name = name;
       this.username = username;
       this.password = password;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }




}


