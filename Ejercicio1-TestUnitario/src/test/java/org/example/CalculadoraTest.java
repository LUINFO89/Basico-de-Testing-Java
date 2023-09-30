package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    private Calculadora calc;

    @BeforeEach
    public void setUP(){
        // Inicializa una isntancia de calculdora antes de cada prueba
        calc = new Calculadora();
    }
    @Test
    public void pruebaSuma() {
        // Prueba la función de suma
        int resultado = calc.sumar(2, 3);
        assertEquals(5, resultado); // Verifica que 2 + 3 sea igual a 5
    }

    @Test
    public void pruebaResta() {
        // Prueba la función de resta
        int resultado = calc.restar(5, 2);
        assertEquals(3, resultado); // Verifica que 5 - 2 sea igual a 3
    }
}
