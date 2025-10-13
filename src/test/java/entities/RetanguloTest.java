package entities;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class RetanguloTest {
    @Test
    void deveCalcularAreaCorretamente() {
        Retangulo r = new Retangulo();
        r.setWidth(3);
        r.setHeight(4);
        assertEquals(12.0, r.calculaArea(), 0.0001);
    }

    @Test
    void deveCalcularPerimetroCorretamente() {
        Retangulo r = new Retangulo();
        r.setHeight(3);
        r.setWidth(4);
        assertEquals(14.0, r.calculaPerimetro(), 0.0001);
    }

    @Test
    void deveCalcularDiagonalCorretamente() {
        Retangulo r = new Retangulo();
        r.setHeight(3);
        r.setWidth(4);
        assertEquals(5.0, r.calculaDiagonal(), 0.0001);
    }
}
