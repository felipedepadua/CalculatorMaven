/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fdepadua
 */
public class MultiplyTest {
    
    public MultiplyTest() {
    }
    

    @Test
    public void testTimes() {
        System.out.println("times");
        int c = 10;
        int d = 34;
        Multiply instance = new Multiply();
        int expResult = 340;
        int result = instance.times(c, d);
        assertEquals(expResult, result);
        
    }
    
}
