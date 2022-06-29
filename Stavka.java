package main.java;

import java.math.BigDecimal;

public  class Stavka{

    protected Integer kolicina;
    protected BigDecimal cijena;
    protected BigDecimal iznos;
    protected Artikal artikalObject;

    public Stavka() {}

    public Stavka(final Artikal artikalObject, final int kolicina) {
        this.artikalObject = artikalObject;
        this.cijena = artikalObject.getCijena();
        this.kolicina = kolicina;
        this.iznos = izracunajIznosStavke();
    }


    public BigDecimal getCijena() {
        return cijena;
    }
    public int getKolicina() {
        return kolicina;
    }
    public BigDecimal getIznos() {
        return iznos;
    }
    public Artikal getArtikalObject() {
        return artikalObject;
    }
    protected void izmjenaCijeneFunkcija( final BigDecimal novaCijena) {
    }

    protected void setIznos(final BigDecimal iznos) {
        this.iznos = iznos;
    }
    protected void setKolicina(final Integer kolicina) {
        this.kolicina = kolicina;
    }

    private BigDecimal izracunajIznosStavke(){
        BigDecimal iznos;
        iznos= cijena.multiply(new BigDecimal(kolicina));
        return iznos;
    }

    @Override
    public boolean equals( final Object obj) {
        if(this == obj){ return true; }  //ako se usporeduje sa samim sobom
        if (!(obj instanceof Stavka)) { //null instanca
            return false;
        }
        final Stavka stavka=(Stavka) obj;
        if(this.artikalObject.getSifra().equals(stavka.getArtikalObject().getSifra())  && this.getCijena().equals(stavka.getCijena()))  return true;
        else return false;
    }

    @Override
    public int hashCode() {
        int result = this.getArtikalObject().getSifra().hashCode();
        result= 29 * result;

        return result;
    }
}