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
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import pojo.Lib;
import util.FUtil;

/**
 *
 * @author TUF
 */
public class DAOLibTest {
    
    public DAOLibTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of rtvBook method, of class DAOLib.
     */
    @Test
    public void testRtvBook() {
        System.out.println("Test List Book");
        DAOLib daoLib = new DAOLib();
        List<Lib> result = daoLib.rtvBook();
         System.out.println("Total Book: " + result.toArray().length);
        assertFalse(result.isEmpty());
        // TODO review the generated test code and remove the default call to fail.
    }
    /**
     * Test of getbyID method, of class DAOLib.
     */
    
    @Test
    public void testGetbyID() {
        System.out.println("Test getby ID");
        String idLib = "1";
        DAOLib daoLib = new DAOLib();
        List<Lib> result = daoLib.getbyID(idLib);
        System.out.println(result.toArray().length);
        assertThat(result.toArray().length, is(not(equalTo(idLib))));
        
    }
    
    /**
     * Test of addBook method, of class DAOLib.
     */
    
    @Test
    public void testAddBook() {
        System.out.println("Test AddBook");
        Lib lib = new Lib();
        lib.setImg("1CPvdtivn63bJ5BOmSOngFFiMqII6UwCU");
        lib.setJudul("Algorithm & DS C1");
        lib.setPenulis("Hasan");
        lib.setGenre("Science");
        lib.setLink("1GgzISEDwLQKtqZ-eW1-9-f6dGiu6P4vq");
        DAOLib daoLib = new DAOLib();
        daoLib.addBook(lib);
        assertNotNull(lib);
    }
    
    
    /**
     * Test of deleteBook method, of class DAOLib.
     */
    @Test
    public void testDeleteBook() {
        System.out.println("Test DeleteBook");
        Integer idLib = 6;
        DAOLib daoLib = new DAOLib();
        Transaction transaction = null;
        Session session = FUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        daoLib.deleteBook(idLib);
        transaction.commit();
        Lib deleteLib =(Lib) session.get(Lib.class, idLib);
        assertNull(deleteLib);
  
        }
    /**
     * Test of editBook method, of class DAOLib.
     */
    @Test
    public void testEditBook() {
        System.out.println("Test EditBook");
        DAOLib daoLib = new DAOLib();
        Transaction transaction = null;
        Session session = FUtil.getSessionFactory().openSession();
        Integer id = 4;
        Lib lib = new Lib();
        lib.setId(id);
        lib.setImg("1CPvdtivn63bJ5BOmSOngFFiMqII6UwCU");
        lib.setJudul("Algorithm & DS C1");
        lib.setPenulis("Gaze");
        lib.setGenre("Saints");
        lib.setLink("1GgzISEDwLQKtqZ-eW1-9-f6dGiu6P4vq");
        transaction = session.beginTransaction();
        daoLib.editBook(lib);
        transaction.commit();
        Lib updateLib = (Lib) session.get(Lib.class,id);
        String expResult ="Algorithm & DS C1";
        String result  = updateLib.getJudul();
        System.out.println(expResult);
        System.out.println(result);
        assertEquals(expResult, result);
    }
    
    
}

   
 