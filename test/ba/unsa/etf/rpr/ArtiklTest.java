package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void getNaziv() {
        Artikl a = new Artikl("biciklo",120,"56");
        assertTrue("biciklo".equals(a.getNaziv()));
    }

    @Test
    void getCijena() {
        Artikl a = new Artikl("biciklo",120,"56");
        assertEquals(120,a.getCijena());
    }

    @Test
    void getKod() {
        Artikl a = new Artikl("biciklo",120,"56");
        assertTrue("56".equals(a.getKod()));
    }
}