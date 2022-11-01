/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.hibernate.*;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Farhan
 */
public class FUtil {

    private static final SessionFactory sessionFactory;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    	public static HttpSession getSession() {
		return (HttpSession) FacesContext.getCurrentInstance()
				.getExternalContext().getSession(false);
	}

	public static HttpServletRequest getRequest() {
		return (HttpServletRequest) FacesContext.getCurrentInstance()
				.getExternalContext().getRequest();
	}

	public static String getUserName() {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance()
				.getExternalContext().getSession(false);
		return session.getAttribute("sesName").toString();
	}

	public static String getUserId() {
		HttpSession session = getSession();
		if (session != null)
			return (String) session.getAttribute("userid");
		else
			return null;
	}
        
     public String validateAddB(String imglink, String judul, String penulis, String booklink, String genre){
     ArrayList<String> errList = new ArrayList<>();
     String alert = "";
            
            if(!judul.matches("[^<>{}]+")){
            errList.add(" Invalid Book Title ");
            }
            if (!penulis.matches("[^<>{}]+")){
            errList.add(" Invalid Writer Name ");
            }
            if (!genre.matches("[^<>{}]+")){
            errList.add(" Invalid Genre ");
            }
            if (!imglink.matches("https:\\/\\/drive\\.google\\.com\\/file\\/d\\/(.*?)\\/view\\?usp\\=sharing")){
            errList.add(" Invalid Image Link (Must Google Drive) ");
            }
            if (!booklink.matches("https:\\/\\/drive\\.google\\.com\\/file\\/d\\/(.*?)\\/view\\?usp\\=sharing")){
            errList.add(" Invalid Book Link (Must Google Drive) ");
            }
            
           if (!errList.isEmpty()) {
                for (String msg : errList) {
                alert += ("|| " +msg );
            }
           }  
           return alert;
    }
     
     public String validateEditB(String imglink, String judul, String penulis, String booklink, String genre){
     ArrayList<String> errList = new ArrayList<>();
     String alert = "";
            
            if(!judul.matches("[^<>{}]+")){
            errList.add(" Invalid Book Title ");
            }
            if (!penulis.matches("[^<>{}]+")){
            errList.add(" Invalid Writer Name ");
            }
            if (!genre.matches("[^<>{}]+")){
            errList.add(" Invalid Genre ");
            }
            if (!imglink.matches("https:\\/\\/drive\\.google\\.com\\/file\\/d\\/(.*?)\\/view\\?usp\\=sharing")){
            errList.add(" Invalid Image Link (Must Google Drive) ");
            }
            if (!booklink.matches("https:\\/\\/drive\\.google\\.com\\/file\\/d\\/(.*?)\\/view\\?usp\\=sharing")){
            errList.add(" Invalid Book Link (Must Google Drive) ");
            }
            
           if (!errList.isEmpty()) {
                for (String msg : errList) {
                alert += ("|| " +msg );
            }
           }  
           return alert;
    }
    
}
