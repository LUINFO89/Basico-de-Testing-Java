package Pasarela;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class MiClaseQueProcesaPagosTest {
    @Test
    public void pruebaProcesarPagoExitoso() {
        // Creamos un mock de la pasarela de pago
        PasarelaPago pasarelaSimulada = mock(PasarelaPago.class);

        // Configuramos el comportamiento del mock para que siempre retorne true
        when(pasarelaSimulada.procesarPago(anyDouble(), anyString())).thenReturn(true);

        // Creamos una instancia de la clase bajo prueba, inyectando el mock de la pasarela
        MiClaseQueProcesaPagos miClase = new MiClaseQueProcesaPagos(pasarelaSimulada);

        // Llamamos al método bajo prueba
        boolean resultado = miClase.realizarPago(100.0, "1234-5678-9012-3456");

        // Verificamos que el pago se haya realizado correctamente (true)
        assertTrue(resultado);

        // Verificamos que se llamó a procesarPago con los parámetros esperados
        verify(pasarelaSimulada).procesarPago(100.0, "1234-5678-9012-3456");
    }
}
