package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;

public class VerificarContraseñaTest {


        @Test
        public void pruebaContraseñaValida() {
            // Prueba una contraseña que cumple con los requisitos
            assertTrue(VerificarContraseña.verificarContraseña("Passw0rd"));
        }

        @Test
        public void pruebaContraseñaCorta() {
            // Prueba una contraseña que es demasiado corta
            assertFalse(VerificarContraseña.verificarContraseña("Pwd1"));
        }

        @Test
        public void pruebaContraseñaSinMayuscula() {
            // Prueba una contraseña que no contiene una letra mayúscula
            assertFalse(VerificarContraseña.verificarContraseña("password1"));
        }

        @Test
        public void pruebaContraseñaSinNumero() {
            // Prueba una contraseña que no contiene un número
            assertFalse(VerificarContraseña.verificarContraseña("Password"));
        }
    }


}