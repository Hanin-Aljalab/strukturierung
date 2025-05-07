import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class VektorTest {

    @Test
    public void testAdd() {
        Vektor v1 = new Vektor(1, 2, 3);
        Vektor v2 = new Vektor(4, 5, 6);
        Vektor expected = new Vektor(5, 7, 9);
        Assertions.assertEquals(expected, v1.add(v2));
    }

    @Test
    public void testSubtract() {
        Vektor v1 = new Vektor(4, 5, 6);
        Vektor v2 = new Vektor(1, 2, 3);
        Vektor expected = new Vektor(3, 3, 3);
        Assertions.assertEquals(expected, v1.subtract(v2));
    }

    @Test
    public void testSkalarMultiplikation() {
        Vektor v = new Vektor(1, 2, 3);
        Vektor expected = new Vektor(2, 4, 6);
        Assertions.assertEquals(expected, v.skalareMultiplikation(2));
    }

    @Test
    public void testSkalarProdukt() {
        Vektor v1 = new Vektor(1, 2, 3);
        Vektor v2 = new Vektor(4, 5, 6);
        Assertions.assertEquals(32.0, v1.skalarProdukt(v2), 0.0001);
    }

    @Test
    public void testKreuzProdukt() {
        Vektor v1 = new Vektor(1, 2, 3);
        Vektor v2 = new Vektor(4, 5, 6);
        Vektor expected = new Vektor(-3, 6, -3);
        Assertions.assertEquals(expected, v1.kreuzProdukt(v2));
    }

    @Test
    public void testBerechneVektorLaenge() {
        Vektor v = new Vektor(3, 4, 0);
        Assertions.assertEquals(5.0, v.berechneVektorLaenge(), 0.0001);
    }

    @Test
    public void testParallelitaetUberpruefen() {
        Vektor v1 = new Vektor(1, 2, 3);
        Vektor v2 = new Vektor(2, 4, 6);
        Assertions.assertTrue(v1.parallelitaetUberpruefen(v2));
    }

    @Test
    public void testWinkelBerechnen() {
        Vektor v1 = new Vektor(1, 0, 0);
        Vektor v2 = new Vektor(0, 1, 0);
        Assertions.assertEquals(Math.PI / 2, v1.winkelBerechnen(v2), 0.0001);
    }

    @Test
    public void testEquals() {
        Vektor v1 = new Vektor(1, 2, 3);
        Vektor v2 = new Vektor(1, 2, 3);
        Vektor v3 = new Vektor(3, 2, 1);
        assertEquals(v1, v2);
        assertNotEquals(v1, v3);
    }

    @Test
    public void testToString() {
        Vektor v = new Vektor(1, 2, 3);
        String expected = "(1.0)\n(2.0)\n(3.0)\n";
        Assertions.assertEquals(expected, v.toString());
    }
}
