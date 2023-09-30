package RomanNumeralsTest;

public class RomanNumerals {
    public static String arabicToRoman(int n) {
        if (n == 1) {
            return "I";
        } else if (n == 5) {
            return "V";
        } else if (n == 10) {
            return "X";
        } else {
            return ""; // Retornamos cadena vacía para otros casos (por ahora)
        }
    }
}
