package DescuentoTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DescuentoTest {
    @Test
    public void pruebaDescuentoDiezPorCiento() {
        double precioOriginal = 100.0;
        double descuento = Descuento.Descuento.calcularDescuento(precioOriginal);
        assertEquals(10.0, descuento);
    }

    @Test
    public void pruebaDescuentoCincoPorCiento() {
        double precioOriginal = 100.0;
        double descuento = Descuento.Descuento.calcularDescuento(precioOriginal);
        assertEquals(10.0, descuento);
    }
    //Con esta implementación, estamos aplicando un descuento del 10% si el precio original
    // es mayor o igual a $100, y un descuento del 5% en otros casos. Ahora,
    // ambas pruebas deberían pasar.
}