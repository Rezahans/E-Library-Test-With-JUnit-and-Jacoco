/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.math.BigInteger;
import java.util.List;
import org.hibernate.SQLQuery;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.hibernate.Session;
import org.hibernate.Transaction;
import static org.junit.Assert.*;
import util.FUtil;

/**
 *
 * @author Farhan
 */
public class LibTest {
    
    public LibTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         System.out.println("Begin Test in package pojo, Lib Class");
    }
    
    @After
    public void tearDown() {
         System.out.println("Done Test in package pojo, Lib Class");
    }
    private final Lib instance = new Lib();
    /**
     * Test of getAllRecords method, of class Lib.
     */
    @Test
    public void testGetAllRecords() {
        System.out.println("getAllRecords");
        List<Lib> result = instance.getAllRecords();
        assertFalse(result.isEmpty());
    }

    /**
     * Test of goBack method, of class Lib.
     */
    @Test
    public void testGoBack() {
        System.out.println("goBack");
        String expResult = "dash";
        String result = instance.goBack();
        assertEquals(expResult, result);
    }

    /**
     * Test of getById method, of class Lib.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        int ids = 1;
        String expResult = "edit";
        String result = instance.getById(ids);
        assertEquals(expResult, result);
    }
    
    public void testGetByIdInvalid() {
        System.out.println("getByIdInvalid");
        int ids = 999;
        String expResult = "err";
        String result = instance.getById(ids);
        assertEquals(expResult, result);
    }

    /**
     * Test of saveLib method, of class Lib.
     */
    @Test
    public void testSaveLib() {
        System.out.println("saveLib");
        instance.setImg("https://drive.google.com/file/d/1dETHjmV0vZu1Np6SibaDtmCkjEjQccb9/view?usp=sharing");
        instance.setJudul("MEIN KAMPF 123");
        instance.setPenulis("Hitler");
        instance.setGenre("Comedy");
        instance.setLink("https://drive.google.com/file/d/1dETHjmV0vZu1Np6SibaDtmCkjEjQccb9/view?usp=sharing");
        String expResult = "dash";
        String result = instance.saveLib();
        assertEquals(expResult, result);
    }
    @Test
    public void testSaveLibInvalid() {
        System.out.println("saveLibInvalid");
        instance.setImg("https://drive.gle.com/file/d/1dETHjmV0vZu1Np6SibaDtmCkjEjQccb9/view?usp=sharing");
        instance.setJudul("MEIN K<>AMPF");
        instance.setLink("https://drive.ggle.com/file/d/1dETHjmV0vZu1Np6SibaDtmCkjEjQccb9/view?usp=sharing");
        instance.setPenulis("Hitl<>er");
        instance.setGenre("Come<>dy");
        String expResult = "err";
        String result = instance.saveLib();
        assertEquals(expResult, result);
    }
    
    

    /**
     * Test of editLib method, of class Lib.
     */
    @Test
    public void testEditLib() {
        System.out.println("editLib");
        String expResult = "dash";
        instance.setId(3);
        instance.setImg("https://drive.google.com/file/d/1dETHjmV0vZu1Np6SibaDtmCkjEjQccb9/view?usp=sharing");
        instance.setJudul("MEIN KAMPF 321");
        instance.setLink("https://drive.google.com/file/d/1dETHjmV0vZu1Np6SibaDtmCkjEjQccb9/view?usp=sharing");
        instance.setPenulis("Hitler");
        instance.setGenre("Comedy");
        String result = instance.editLib();
        assertEquals(expResult, result);
    }
    @Test
    public void testEditLibInvalid() {
        System.out.println("editLibInvalid");
        String expResult = "err";
        instance.setId(3);
        instance.setImg("https://ive.google.com/file/d/1dETHjmV0vZu1Np6SibaDtmCkjEjQccb9/view?usp=share_link");
        instance.setJudul("MEIN<>KAMPF");
        instance.setLink("https://ive.google.com/file/d/1dETHjmV0vZu1Np6SibaDtmCkjEjQccb9/view?usp=share_link");
        instance.setPenulis("Hitler<>");
        instance.setGenre("Comedy<>");
        String result = instance.editLib();
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteLib method, of class Lib.
     */
    
    @Test
    public void testDeleteLib() {
        System.out.println("deleteLib");
        int id = getLastID();
        System.out.println("Deleted "+id);
        String expResult = "dash";
        String result = instance.deleteLib(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getId method, of class Lib.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Integer expResult = 1;
        instance.setId(1);
        Integer result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Lib.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = 1;
        instance.setId(id);
    }

    /**
     * Test of getImg method, of class Lib.
     */
    @Test
    public void testGetImg() {
        System.out.println("getImg");
        String expResult = "https://drive.google.com/file/d/1dETHjmV0vZu1Np6SibaDtmCkjEjQccb9/view?usp=sharing";
        instance.setImg("https://drive.google.com/file/d/1dETHjmV0vZu1Np6SibaDtmCkjEjQccb9/view?usp=sharing");
        String result = instance.getImg();
        assertEquals(expResult, result);
    }

    /**
     * Test of setImg method, of class Lib.
     */
    @Test
    public void testSetImg() {
        System.out.println("setImg");
        String img = "https://drive.google.com/file/d/1dETHjmV0vZu1Np6SibaDtmCkjEjQccb9/view?usp=share_link";
        instance.setImg(img);
    }

    /**
     * Test of getJudul method, of class Lib.
     */
    @Test
    public void testGetJudul() {
        System.out.println("getJudul");
        String expResult = "iniJudul";
        instance.setJudul("iniJudul");
        String result = instance.getJudul();
        assertEquals(expResult, result);
    }

    /**
     * Test of setJudul method, of class Lib.
     */
    @Test
    public void testSetJudul() {
        System.out.println("setJudul");
        String judul = "iniJudul";
        instance.setJudul(judul);
    }

    /**
     * Test of getPenulis method, of class Lib.
     */
    @Test
    public void testGetPenulis() {
        System.out.println("getPenulis");
        String expResult = "Farhan";
        instance.setPenulis("Farhan");
        String result = instance.getPenulis();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPenulis method, of class Lib.
     */
    @Test
    public void testSetPenulis() {
        System.out.println("setPenulis");
        String penulis = "Farhan";
        instance.setPenulis(penulis);
    }

    /**
     * Test of getGenre method, of class Lib.
     */
    @Test
    public void testGetGenre() {
        System.out.println("getGenre");
        String expResult = "Comedy";
        instance.setGenre("Comedy");
        String result = instance.getGenre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGenre method, of class Lib.
     */
    @Test
    public void testSetGenre() {
        System.out.println("setGenre");
        String genre = "Comedy";
        instance.setGenre(genre);
    }

    /**
     * Test of getLink method, of class Lib.
     */
    @Test
    public void testGetLink() {
        System.out.println("getLink");
        String expResult = "https://drive.google.com/file/d/1dETHjmV0vZu1Np6SibaDtmCkjEjQccb9/view?usp=share_link";
        instance.setLink("https://drive.google.com/file/d/1dETHjmV0vZu1Np6SibaDtmCkjEjQccb9/view?usp=share_link");
        String result = instance.getLink();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLink method, of class Lib.
     */
    @Test
    public void testSetLink() {
        System.out.println("setLink");
        String link = "https://drive.google.com/file/d/1dETHjmV0vZu1Np6SibaDtmCkjEjQccb9/view?usp=share_link";
        instance.setLink(link);
    }

    /**
     * Test of getgLink method, of class Lib.
     */
    @Test
    public void testGetgLink() {
        System.out.println("getgLink");
        String expResult = "https://drive.google.com/uc?export=download&id=";
        instance.setgLink("https://drive.google.com/uc?export=download&id=");
        String result = instance.getgLink();
        assertEquals(expResult, result);
    }

    /**
     * Test of setgLink method, of class Lib.
     */
    @Test
    public void testSetgLink() {
        System.out.println("setgLink");
        String gLink = "https://drive.google.com/uc?export=download&id=";
        instance.setgLink(gLink);
    }
    
    public Integer getLastID() {
        Transaction transaction = null;
        Session session = FUtil.getSessionFactory().openSession();
        Integer c = null;
        try {
            transaction = session.beginTransaction();
            String sql = "SELECT id FROM lib ORDER BY id DESC LIMIT 1";
            SQLQuery query = session.createSQLQuery(sql);
            c = (Integer) query.uniqueResult();
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            session.close();
        }
        return c;
    }
    
}
