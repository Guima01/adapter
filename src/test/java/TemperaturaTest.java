import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TemperaturaTest {

    @Test
    void deveRetornarValorEmFarenheit() {
        Escala escala = new Escala();
        escala.setTemperatura(54);

        assertEquals(54, escala.getTemperatura());
    }

    @Test
    void deveRetornarValorEmCelsius() {
        Escala escala = new Escala();
        escala.setTemperatura(54);

        assertEquals(12.222222328186035, escala.getCelsius());
    }
}
