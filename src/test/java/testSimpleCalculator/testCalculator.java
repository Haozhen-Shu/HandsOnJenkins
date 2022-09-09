package testSimpleCalculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import simpleCalculator.Calculator;

public class testCalculator {
    private Calculator objCalculatorTest;

    @Before
    public void setUp(){
        objCalculatorTest = new Calculator();
    }

    @Test
    public void testAdd(){
        int x = 20;
        int y = 17;
        int expectedResult = 37;
        int result = objCalculatorTest.add(x, y);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testSubtract(){
        int x = 20;
        int y = 17;
        int expectedResult = 3;
        int result = objCalculatorTest.subtract(x, y);
        Assert.assertEquals(expectedResult, result, 0.0005);
    }

    @Test
    public void testMultiply(){
        int x = 20;
        int y = 17;
        int expectedResult = 340;
        double result = objCalculatorTest.multiply(x, y);
        Assert.assertEquals(expectedResult, result, 0.0005);
    }

    @Test
    public void testDivide(){
        int x = 20;
        int y = 10;
        double expectedResult = 2.0;
        double result = objCalculatorTest.divide(x, y);
        Assert.assertEquals(expectedResult, result, 0.0005);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        int x = 15;
        int y = 0;
        objCalculatorTest.divide(x, y);
    }

    @Test
    public void testExponent(){
        int x = 2;
        int y = 3;
        long  expectedResult = 8;
        double result = objCalculatorTest.exponent(x, y);
        Assert.assertEquals(expectedResult, result, 0.0005);
    }

}
