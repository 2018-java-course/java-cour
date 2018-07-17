/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex12_3_exercise;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author claudio
 */
public class ShirtTest {
    
    public ShirtTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        Shirt instance = new Shirt(0.0,'X','R');
        String expResult = "Red";
        String result = instance.getColor();
        assertEquals(expResult, result);        
    }
    @Test
    public void testGetColorUnknown() {
        System.out.println("getColor");
        Shirt instance = new Shirt(0.0,'X','X');
        String expResult = "Unknown";
        String result = instance.getColor();
        assertEquals(expResult, result);        
    }
    
}
