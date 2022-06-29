package main.java;

import java.math.BigDecimal;
import java.util.List;

public interface Funkcije {

    Artikal kreirajArtikal(final String naziv, final String sifra, final BigDecimal cijena, final boolean promjenjivaCijena );
    Stavka kreirajStavku(final Artikal a, final int kolicina);

    List<Stavka> dodajSTavkuUListuStavaka(final List<Stavka> lista,final Stavka s);

    Racun kreirajRacun(final int br, final List<Stavka> stavkaRacuna);
    void IspisRacuna(final List<Racun> racunList);

    List<Artikal> dodajArtikal(final List<Artikal>listaArtikala,final Artikal a);

    List<Racun> dodajRacun(final List<Racun>listaRacuna, final Racun r);

    List<Racun> obrisiRacun(final List<Racun>listaRacuna,final Racun r);

}
