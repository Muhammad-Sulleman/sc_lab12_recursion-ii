package lab12;


import org.junit.Test;
import static org.junit.Assert.*;

public class SumOfDigitsTest {
    @Test
    public void testSumOfDigits_PositiveNumber() {
        int number = 12345;
        int result = SumOfDigits.sumOfDigits(number);
        assertEquals(15, result);
    }

    @Test
    public void testSumOfDigits_Zero() {
        int number = 0;
        int result = SumOfDigits.sumOfDigits(number);
        assertEquals(0, result);
    }

    @Test
    public void testSumOfDigits_NegativeNumber() {
        int number = -12345;
        int result = SumOfDigits.sumOfDigits(number);
        assertEquals(15, result);
    }

    @Test
    public void testSumOfDigits_LargeNumber() {
        int number = 987654321;
        int result = SumOfDigits.sumOfDigits(number);
        assertEquals(45, result);
    }
}
