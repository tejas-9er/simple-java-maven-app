import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Assert;
//import org.junit.Before;
public class CalculatorTest {
   /* @Before
    public void setUp() {
        new Calculator();
    }*/
    @Test
    public void testAdd() {
        int a = 15;
        int b = 20;
        int expectedResult = 35;
        long result = Calculator.add(a, b);
        Assert.assertEquals(expectedResult, result);;
    }
    @Test
    public void testSubtract() {
        int a = 25;
        int b = 20;
        int expectedResult = 5;
        long result = Calculator.sub(a, b);
        Assert.assertEquals(expectedResult, result);;
    }
    @Test
    public void testMultiply() {
        int a = 10;
        int b = 25;
        long expectedResult = 250;
        long result = Calculator.mult(a, b);
        Assert.assertEquals(expectedResult, result);;
    }
    @Test
    public void testDivide() {
        int a = 56;
        int b = 10;
        double expectedResult = 5.6;
        double result = Calculator.div(a, b);
        Assert.assertEquals(expectedResult, result,0.00005);
    }
    @Test
    public void testDivideByZero() {
        int a = 15;
        int b = 0;
        Throwable exception = assertThrows(IllegalArgumentException.class,
                ()->{Calculator.div(a,b);} );
        assertTrue(exception.getMessage().contains("Cannot Divide by 0"));
    }
}
