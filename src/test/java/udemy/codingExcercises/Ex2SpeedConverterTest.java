package udemy.codingExcercises;

import org.junit.jupiter.api.Test;
import Udemy.CodingExcercises.section5.Ex2SpeedConverter;

import static org.testng.Assert.assertEquals;

public class Ex2SpeedConverterTest {

    @Test
    public void testToMilesPerHourPositiveInput() {
        double kmph = 70.0;
        long mph = Ex2SpeedConverter.toMilesPerHour(kmph);
        assertEquals(43, mph);
    }

    @Test
    public void testToMilesPerHourZeroInput() {
        double kmph = 0.0;
        long mph = Ex2SpeedConverter.toMilesPerHour(kmph);
        assertEquals(0, mph);
    }

    @Test
    public void testToMilesPerHourNegativeInput() {
        double kmph = -10.0;
        long mph = Ex2SpeedConverter.toMilesPerHour(kmph);
        assertEquals(-1, mph);
    }

    @Test
    public void testPrintConversionPositiveInput() {
        double kmph = 50.0;
        Ex2SpeedConverter.printConversion(kmph);
        // Since this method uses System.out.println, it's difficult to directly test the output in JUnit.
        // However, we can verify if the logic executes without errors for valid inputs.
    }

    @Test
    public void testPrintConversionNegativeInput() {
        double kmph = -20.0;
        Ex2SpeedConverter.printConversion(kmph);
        // Similar to the previous test, we can only verify if there are no errors.
    }

    @Test
    public void testPrintConversionZeroInput() {
        double kmph = 0.0;
        Ex2SpeedConverter.printConversion(kmph);
        // Similar to the previous test, we can only verify if there are no errors.
    }
}
