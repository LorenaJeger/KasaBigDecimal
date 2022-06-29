package main.java;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Racun  {
    private final Integer brRacuna;
    private final BigDecimal suma;
    private final String datum;
    private final List<Stavka> ListaStavaka;

    public int getBrRacuna() {
        return this.brRacuna;
    }

    public BigDecimal getSuma() {
        return this.suma;
    }

    public String getDatum() {
        return this.datum;
    }

    public List<Stavka> getListaStavaka() {
        return this.ListaStavaka;
    }
    public  Racun( final int br, final List<Stavka> s){
        brRacuna=br;
        this.suma=izracunSume(s);
        this.ListaStavaka =s;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        this.datum= (dtf.format(now));
    }
    private BigDecimal izracunSume(final List<Stavka> stavkeRacuna){
        BigDecimal sum = new BigDecimal(0);
        for( Stavka s: stavkeRacuna)
                sum= sum.add(s.getIznos()) ;
        return sum;
    }

}
