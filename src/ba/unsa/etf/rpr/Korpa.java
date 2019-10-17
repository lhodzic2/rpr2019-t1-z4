package ba.unsa.etf.rpr;

public class Korpa {
    private final int maksimalnoUKorpi=50;
    private Artikl[] artikli=new Artikl[maksimalnoUKorpi];
    int trenutnoUKorpi=0;

    public Artikl[] getArtikli() {
        return artikli;
    }

    public boolean dodajArtikl(Artikl a) {
        if ( trenutnoUKorpi < maksimalnoUKorpi ) {
            artikli[trenutnoUKorpi]=a;
            trenutnoUKorpi = trenutnoUKorpi + 1;
            return true;
        }
        return false;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for (int i = 0; i < trenutnoUKorpi ; i = i + 1) {
            if (artikli[i] != null && artikli[i].getKod().equals(kod)) {
                Artikl pom = artikli[i];
                for (int j = i; j < trenutnoUKorpi-1 ; j = j + 1) {
                    artikli[j] = artikli[j+1];
                }
                artikli[trenutnoUKorpi-1] = null;
                trenutnoUKorpi = trenutnoUKorpi -1;
                return pom;
            }
        }
        return null;
    }

    public int dajUkupnuCijenuArtikala() {
        int ukupno=0;
        for (Artikl a : artikli) {
            if (a!=null) {
                ukupno = ukupno + a.getCijena();
            }
        }
        return ukupno;
    }
}
