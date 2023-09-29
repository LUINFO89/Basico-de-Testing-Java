package Descuento;

public class Descuento {
    /*public static double calcularDescuento(double precioOriginal) {
        return 10.0; // Por ahora, siempre retornamos 10.0
    }*/
    public static double calcularDescuento(double precioOriginal) {
        if (precioOriginal >= 100.0) {
            return precioOriginal * 0.10; // 10% de descuento
        } else {
            return precioOriginal * 0.05; // 5% de descuento
        }
    }


}
