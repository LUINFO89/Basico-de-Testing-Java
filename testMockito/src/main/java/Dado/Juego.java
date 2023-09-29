package Dado;

public class Juego {
    private Dado dado;

    public Juego(Dado dado) {
        this.dado = dado;
    }

    public int lanzarDado() {
        return dado.lanzar();
    }
}
