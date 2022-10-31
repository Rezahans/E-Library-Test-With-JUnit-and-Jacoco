/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TUF
 */
public class LibrariansTest {
    
    public LibrariansTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of login_user method, of class Librarians.
     */
    @Test
    public void testLogin_user() {
        System.out.println("Test login_user");
        Librarians DaoLib = new Librarians();
        DaoLib.setUsername("sesName");
        DaoLib.setPassword("123456");
        String expResult ="Dashboard";
        String result = DaoLib.login_user();
        System.out.println(expResult);
        System.out.println(result);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of logout method, of class Librarians.
     */
    @Test
    public void testLogout() {
        System.out.println("Test logout");
        Librarians DaoLib = new Librarians();
        String expResult = "index";
        String result = DaoLib.logout();
        System.out.println(expResult);
        System.out.println(result);
        assertEquals(expResult, result);
        
    }

}