package main.java;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FunkcijeKase implements Funkcije {

    @Override
    public Artikal kreirajArtikal(final String naziv, final String sifra, final BigDecimal cijena, final boolean promjenjivaCijena) {
        Artikal artikal= new Artikal(naziv, sifra, cijena, promjenjivaCijena);
        return artikal;
    }

    @Override
    public Stavka kreirajStavku(final Artikal a, final int kolicina) {
        StavkaFactory stavkaTrenutna = StavkaFactory.getInstance();
        Stavka stavka=stavkaTrenutna.createStavka(a, kolicina);
        return stavka;
    }

    @Override
    public List<Stavka> dodajSTavkuUListuStavaka(final List<Stavka> lista, final Stavka s) {
        lista.add(s);
        return lista;
    }

    @Override
    public Racun kreirajRacun(final int br, final List<Stavka> stavkaRacuna){
        List<Stavka> stavkeBezDuplikata;
        stavkeBezDuplikata=  makniDUplikate(stavkaRacuna);
        Racun racuniFactory= new Racun(br, stavkeBezDuplikata);
        return racuniFactory;
    }
    @Override
    public void IspisRacuna(final List<Racun> racunList) {

        ispisSvihRacuna(racunList);
    }

    private void ispisSvihRacuna(final List<Racun> racunList) {
        System.out.println("Ispis svih računa: ");

        for (Racun r: racunList) {
            System.out.println("----------------------------------");
            System.out.println(r.getDatum());
            System.out.println("Broj računa: " + r.getBrRacuna());
            System.out.println("artikal: " + "cijena: " + "kol " + "iznos");

            r.getListaStavaka().stream()
                    .map(this::printStavke)
                    .forEach(System.out::println);
            System.out.println("--------------");
            System.out.println("Suma:  " + r.getSuma());

        }}

    private String printStavke(final Stavka s){
        return s.getArtikalObject().getNaziv()+"   "+s.getCijena()+"   "+ s.getKolicina() + "    "+ s.getIznos();
    }
    @Override
    public List<Artikal> dodajArtikal(final List<Artikal>listaArtikala,final Artikal a){
        listaArtikala.add(a);
        return listaArtikala;
    }

    @Override
    public List<Racun> dodajRacun(final List<Racun>listaRacuna,final Racun r){
        listaRacuna.add(r);
        return listaRacuna;
    }

    @Override
    public List<Racun> obrisiRacun(final List<Racun>listaRacuna, final Racun r){
        listaRacuna.remove(r);
        return listaRacuna;
    }

    private static Stavka usporedbaObjekata(final Stavka s1, final Stavka s2) {
        if (s1.equals(s2)) {
            s1.setKolicina(s1.getKolicina()+s2.getKolicina());
            s1.setIznos(s1.getIznos().add(s2.getIznos()));

            return s1;
        }

        return s1;
    }

    private List<Stavka> makniDUplikate(final List<Stavka> listaStavakaSDuplikatima){
        List<Stavka> konacnaLista= new ArrayList<>();
        Stavka duplikat= new Stavka();
        for ( Stavka trenutna:listaStavakaSDuplikatima) {
            if(konacnaLista.contains(trenutna)){
                for(int i=0; i < konacnaLista.size(); i++){
                    duplikat = usporedbaObjekata(trenutna, konacnaLista.get( i) );
                }

                konacnaLista.remove(trenutna);
                konacnaLista.add(duplikat);
            } else
                konacnaLista.add(trenutna);
        }

        return konacnaLista;
    }

}
