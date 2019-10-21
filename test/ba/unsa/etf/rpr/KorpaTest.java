package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void getArtikli() {
        Korpa k = new Korpa();
        k.dodajArtikl(new Artikl("torba", 120, "222"));
        k.dodajArtikl(new Artikl("novcanik", 342, "432"));
        Artikl[] a = new Artikl[50];
        a[0] = new Artikl("torba", 120, "222");
        a[1] = new Artikl("novcanik", 342, "432");
        Artikl[] pom = new Artikl[50];
        pom = k.getArtikli();
        assertEquals(a[0].getCijena(),pom[0].getCijena());
    }

    @Test
    void dodajArtikl() {
        Korpa k = new Korpa();
        k.dodajArtikl(new Artikl("torba",120,"222"));
        assertEquals(120,k.dajUkupnuCijenuArtikala());
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa k = new Korpa();
        k.dodajArtikl(new Artikl("torba",120,"222"));
        k.dodajArtikl(new Artikl("novcanik",342,"432"));
        assertEquals(462,k.dajUkupnuCijenuArtikala());
    }
}