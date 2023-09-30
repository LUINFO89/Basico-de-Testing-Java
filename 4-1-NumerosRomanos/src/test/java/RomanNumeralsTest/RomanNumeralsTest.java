package RomanNumeralsTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {
    @Test
    public void testRoman1() {
        assertEquals("I", RomanNumerals.arabicToRoman(1));
    }

    @Test
    public void testRoman5() {
        assertEquals("V", RomanNumerals.arabicToRoman(5));
    }

    @Test
    public void testRoman10() {
        assertEquals("X", RomanNumerals.arabicToRoman(10));
    }
}
