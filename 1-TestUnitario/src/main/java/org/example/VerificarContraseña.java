package org.example;

public class VerificarContraseña {

        public static boolean verificarContraseña(String contraseña) {
            // Verifica si la contraseña cumple con los requisitos
            // Requisito 1: Debe tener al menos 8 caracteres de longitud
            if (contraseña.length() < 8) {
                return false;
            }

            // Requisito 2: Debe contener al menos una letra mayúscula
            boolean contieneMayuscula = false;
            for (char c : contraseña.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    contieneMayuscula = true;
                    break;
                }
            }

            if (!contieneMayuscula) {
                return false;
            }

            // Requisito 3: Debe contener al menos un número
            boolean contieneNumero = false;
            for (char c : contraseña.toCharArray()) {
                if (Character.isDigit(c)) {
                    contieneNumero = true;
                    break;
                }
            }

            return contieneNumero;
        }


}
