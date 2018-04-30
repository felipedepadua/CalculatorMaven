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
public class SubtractTest {
    
    public SubtractTest() {
    }

    @Test
    public void testMinus() {
        System.out.println("minus");
        int a = 17;
        int b = 5;
        Subtract instance = new Subtract();
        int expResult = 12;
        int result = instance.minus(a, b);
        assertEquals(expResult, result);
     
    }
    
}
