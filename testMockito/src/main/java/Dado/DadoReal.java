package Dado;

import java.util.Random;

public class DadoReal implements Dado {

    private Random random = new Random();

    @Override
    public int lanzar() {
        return random.nextInt(6) + 1; // Simula el lanzamiento de un dado de 6 caras
    }
}
