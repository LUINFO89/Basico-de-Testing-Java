package Pasarela;

public class MiClaseQueProcesaPagos {
    private PasarelaPago pasarelaPago;

    public MiClaseQueProcesaPagos(PasarelaPago pasarelaPago) {
        this.pasarelaPago = pasarelaPago;
    }

    public boolean realizarPago(double monto, String tarjetaCredito) {
        // Lógica para procesar el pago, utilizando la pasarela de pago
        return pasarelaPago.procesarPago(monto, tarjetaCredito);
    }
}
