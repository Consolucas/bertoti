import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AdegaTest {

    @Test
    void adicionarBebidas() {
        Adega adega = new Adega();
        Bebida whisky = new Bebida("Jack Daniels", 100.00, "whisky");

        adega.adicionarBebida(whisky);

        assertEquals(1, adega.getBebidas().size());
    }
}