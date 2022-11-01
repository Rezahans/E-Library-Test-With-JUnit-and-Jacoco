/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Farhan
 */
public class LibrariansTest {
    
    public LibrariansTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.out.println("Begin Test in package pojo, Librarians Class");
    }
    
    @After
    public void tearDown() {
         System.out.println("Done Test in package pojo, Librarians Class");
    }

    private final Librarians instance = new Librarians();
    /**
     * Test of class Librarians.
     */
    @Test
    public void testLogin_user() {
        System.out.println("Testing login_user");
        instance.setUsername("farhan");
        instance.setPassword("farhan");
        String expResult = "dash";
        String result = instance.login_user();
        System.out.println("Expected Result IS: "+expResult + "\nThe Result IS: "+result);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLogin_userInvalid() {
        System.out.println("Testing Invalid login_user");
        instance.setUsername("farhan");
        instance.setPassword("farhan213123");
        String expResult = "index";
        String result = instance.login_user();
        System.out.println("Expected Result IS: "+expResult + "\nThe Result IS: "+result);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLogout() {
        System.out.println("Testing logout");
        
        String expResult = "index";
        String result = instance.logout();
        
        System.out.println("Expected Result IS: "+expResult + "\nThe Result IS: "+result);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of getId method, of class Librarians.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Integer expResult = 2;
        instance.setId(expResult);
        Integer result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Librarians.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = 2;
        instance.setId(id);
    }

    /**
     * Test of getName method, of class Librarians.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Farhan Dwi O";
        instance.setName(expResult);
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Librarians.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Farhan Dwi O";
        instance.setName(name);
    }

    /**
     * Test of getUsername method, of class Librarians.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        String expResult = "farhan";
        instance.setUsername(expResult);
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUsername method, of class Librarians.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "farhan";
        instance.setUsername(username);
    }

    /**
     * Test of getPassword method, of class Librarians.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        String expResult = "farhan";
        instance.setPassword(expResult);
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPassword method, of class Librarians.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "farhan";
        instance.setPassword(password);
    }
    

    
}
