package Dado;

import Dado.Dado;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class JuegoTest {
    @Test
    public void pruebaLanzarDado() {
        // Creamos un mock del dado
        Dado dadoSimulado = mock(Dado.class);

        // Configuramos el comportamiento del mock para que retorne un valor fijo (3) al lanzar
        when(dadoSimulado.lanzar()).thenReturn(3);

        // Creamos una instancia del juego con el dado simulado
        Juego juego = new Juego(dadoSimulado);

        // Lanzamos el dado simulado
        int resultado = juego.lanzarDado();

        // Verificamos que el resultado sea igual al valor fijo que configuramos en el mock (3)
        assertEquals(3, resultado);
    }

}
