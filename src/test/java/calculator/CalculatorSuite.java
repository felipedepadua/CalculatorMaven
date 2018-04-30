/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    calculator.MultiplyTest.class, 
    calculator.DivideTest.class, 
    calculator.CalculatorTest.class, 
    calculator.SubtractTest.class, 
    calculator.SumTest.class})
public class CalculatorSuite {
    
}
