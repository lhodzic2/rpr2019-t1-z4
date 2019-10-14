package ba.unsa.etf.rpr;

public class Supermarket {
    public Artikl[] getArtikli() {
        return artikli;
    }

    Artikl[] artikli=new Artikli[1000];
    private int trenutnoUSupermarketu=0;
    void dodajArtikl(Artikl a) {
        artikli[trenutnoUSupermarketu]=new Artikl(a);
        trenutnoUSupermarketu = trenutnoUSupermarketu + 1;
    }

}
