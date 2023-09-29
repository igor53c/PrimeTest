import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PrimeTestJavaTest {

    @Test
    public void testPrimeNumberWithOne() {
        assertFalse(PrimeTestJava.testPrimeNumber(1));
    }

    @Test
    public void testPrimeNumberWithTwo() {
        assertTrue(PrimeTestJava.testPrimeNumber(2));
    }

    @Test
    public void testPrimeNumberWithThree() {
        assertTrue(PrimeTestJava.testPrimeNumber(3));
    }

    @Test
    public void testPrimeNumberWithFour() {
        assertFalse(PrimeTestJava.testPrimeNumber(4));
    }

    @Test
    public void testPrimeNumberWithNegativeOne() {
        assertFalse(PrimeTestJava.testPrimeNumber(-1));
    }

}