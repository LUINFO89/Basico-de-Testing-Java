package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class OperacionesAritmeticasTest {
    @Test
    public void pruebaSuma(){
        int resultado = OperacionesAritmeticas.suma(2,3);
        //verifica si el resultado es el esperado ( ene ste caso se pasa 5
        assertEquals(5,resultado);
    }

    @Test
    public void pruebaDivisionPorCero() {
        // Verifica si dividir por cero lanza una ArithmeticException
        assertThrows(ArithmeticException.class, () -> {
            OperacionesAritmeticas.dividir(10, 0); // Reemplaza MiClase con el nombre de tu clase
        });
    }



}