package main.java;

import java.math.BigDecimal;

public class Artikal {
    private final String naziv;
    private final String sifra;
    private BigDecimal cijena;
    private final boolean promjenjivaCijena;

    public String getNaziv() {
        return this.naziv;
    }
    public String getSifra() {
        return sifra;
    }
    public BigDecimal getCijena() {
        return this.cijena;
    }

    public boolean getPromjenjivaCijena() {
        return this.promjenjivaCijena;
    }
    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }


    public Artikal(final String naziv, final String sifra, final BigDecimal cijena, final boolean promjenjivaCijena) {
        this.naziv = naziv;
        this.sifra= sifra;
        this.cijena = cijena;
        this.promjenjivaCijena = promjenjivaCijena;
    }

}
