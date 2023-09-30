package calcularBisiento;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnioBisiestoTest {

    /*
    * @Test
    public void pruebaAnioNoBisiesto() {
        assertFalse(AnioBisiesto.esBisiesto(1999));
    }*/
    @Test
    public void pruebaAnioNoBisiesto() {
        assertFalse(AnioBisiesto.esBisiesto(1999));
    }

    @Test
    public void pruebaAnioBisiesto() {
        assertTrue(AnioBisiesto.esBisiesto(2020));
    }
}
