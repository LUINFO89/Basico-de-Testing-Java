package calcularBisiento;

public class AnioBisiesto {

    /*
    public static boolean esBisiesto(int anio) {
        return false; // Por ahora, siempre retornamos false
    }
     */
    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

}
