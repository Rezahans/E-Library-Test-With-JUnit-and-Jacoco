/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import pojo.Librarians;

/**
 *
 * @author TUF
 */
public class DAOLoginTest {
    public DAOLoginTest() {
    }
    DAOLoginTest obj;
    
    @Before
    public void setUp() {
        System.out.println("start testing");
        obj = new DAOLoginTest();
    }
    
    @After
    public void tearDown() {
        System.out.println("end testing");
        obj = null;
    }


    /**
     * Test of getBy method, of class DAOLogin.
     */
    @Test
    public void testGetBy() {
        System.out.println("Test Login");
        String uEmail = "reza";
        String uPass = "reza";
        int empty =0;
        DAOLogin daoLogin = new DAOLogin();
        List<Librarians> result = daoLogin.getBy(uEmail, uPass);
        System.out.println(result.toArray().length);
        assertThat(result.toArray().length, is(not(equalTo(empty))));
     
    }
     
}
