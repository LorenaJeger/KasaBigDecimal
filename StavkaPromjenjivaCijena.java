package main.java;

import java.math.BigDecimal;

class StavkaPromjenjivaCijena extends Stavka {

    public StavkaPromjenjivaCijena(final Artikal a, final Integer kolicina) {
        this.artikalObject = a;
        this.cijena = artikalObject.getCijena();
        this.kolicina = kolicina;
        this.iznos = izracunajIznosNoveStavke();
    }

    @Override
    protected void izmjenaCijeneFunkcija(final BigDecimal novaCijena) {
        this.cijena=novaCijena;
        this.artikalObject.setCijena(novaCijena);
        this.setIznos(izracunajIznosNoveStavke());
    }

    private BigDecimal izracunajIznosNoveStavke(){
        BigDecimal iznos= cijena.multiply(new BigDecimal(kolicina));
        return iznos;
    }

}
