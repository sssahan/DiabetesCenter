/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sachithra sahan
 */
public class HelpTest {
    
    public HelpTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDate method, of class Help.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        int year = 2016;
        int month = 6;
        int day = 16;
        Date expResult = new Date(year-1900,month-1,day);
        Date result = Help.getDate(year, month, day);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getYear method, of class Help.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        Date date = new Date(2016-1900,05-1,25);
        int expResult =2016;
        int result = Help.getYear(date);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getMonth method, of class Help.
     */
    @Test
    public void testGetMonth() {
        System.out.println("getMonth");
        Date date = new Date(2016-1900,10-1,15);
        int expResult = 10;
        int result = Help.getMonth(date);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getDay method, of class Help.
     */
    @Test
    public void testGetDay() {
        System.out.println("getDay");
        Date date = new Date(2016-1900,05-1,12);
        int expResult = 12;
        int result = Help.getDay(date);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isValidDate method, of class Help.
     */
    @Test
    public void testIsValidDate() {
        System.out.println("isValidDate");
        String inDate = "2015-02-06";
        boolean expResult = true;
        boolean result = Help.isValidDate(inDate);
        assertEquals(expResult, result);
        
    }
    
}
