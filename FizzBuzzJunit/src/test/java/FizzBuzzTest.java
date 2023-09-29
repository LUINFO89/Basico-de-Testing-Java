

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzTest {

        @Test
        public void pruebaFizz() {
            assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
            assertEquals("Fizz", FizzBuzz.fizzBuzz(6));
        }

        @Test
        public void pruebaBuzz() {
            assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
            assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
        }

        @Test
        public void pruebaFizzBuzz() {
            assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
            assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
        }

        @Test
        public void pruebaNumero() {
            assertEquals("2", FizzBuzz.fizzBuzz(2));
            assertEquals("7", FizzBuzz.fizzBuzz(7));
        }

}