package ba.unsa.etf.rpr;

public class Artikl{
    private String naziv;
    private int cijena;
    private String kod;
    Artikl(String naziv, int cijena, String kod) {
        this.naziv = naziv;
        this.cijena = cijena;
        this.kod = kod;
    }
    public Artikl(Artikl a) {
        naziv=a.naziv;
        cijena=a.cijena;
        kod=a.kod;
    }
    public String getNaziv() {
        return naziv;
    }

    public int getCijena() {
        return cijena;
    }

    public String getKod() {
        return kod;
    }
}
