package ba.unsa.etf.rpr;

public class Supermarket {
    private final int maksimalnoUSupermarketu=1000;
    private Artikl[] artikli=new Artikl[maksimalnoUSupermarketu];
    private int trenutnoUSupermarketu=0;
    public Artikl[] getArtikli() {
        return artikli;
    }
    void dodajArtikl(Artikl a) {
        if ( trenutnoUSupermarketu < maksimalnoUSupermarketu ) {
            artikli[trenutnoUSupermarketu] = new Artikl(a);
            trenutnoUSupermarketu = trenutnoUSupermarketu + 1;
        }
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for( int i = 0; i < trenutnoUSupermarketu ; i = i + 1) {
            if ( artikli[i] != null && artikli[i].getKod().equals(kod) ) {
                Artikl pom = new Artikl(artikli[i]);
                for ( int j = i ; j < trenutnoUSupermarketu - 1; j=j+1) {
                    artikli[j]=artikli[j+1];
                }
                artikli[trenutnoUSupermarketu-1]=null;
                trenutnoUSupermarketu = trenutnoUSupermarketu -1;
                return pom;
            }
        }
        return null;
    }
}
