import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;
    @BeforeEach
    public void föreTester(){
        calculator= new Calculator();
    }

    @Test
    @DisplayName("Positive test")

    public void testAdd(){
        int actual = calculator.add(8,9);
        assertEquals(17,actual);
    }
    @Test
     @DisplayName("Negative test")

    public void negativTestAdd(){
        int actual = calculator.add(3,6);
        assertNotEquals(12,actual);
    }
    @Test
    public void testSubtract(){
        int actual = calculator.subtract(10,3);
        assertEquals(7,actual);

    }
    @Test
    public void testMultiply(){
        int actual = calculator.multiply(4,6);
        assertEquals(24,actual);

    }
    @Test
    public void testDivide(){
        double actual = calculator.divide(40,5);
        assertEquals(8,actual);

    }

    @Test
    public void testSquareRootOf() {
        double result = calculator.squareRootOf(4);
        assertEquals(2.0, result);
    }

}
