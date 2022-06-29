package main.java;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        FunkcijeKaseFactory funkcijeKaseFactory= FunkcijeKaseFactory.getInstance();

        Funkcije kasaBin = funkcijeKaseFactory.createFunkcijeKase();

        KasaFactory kasaFactory= KasaFactory.getInstance();
        Kasa kasa = kasaFactory.createKasa();

        Artikal artikalMlijeko= kasaBin.kreirajArtikal("Mlijeko", "01", (new BigDecimal("3.3")), false);
        Artikal artikalKava= kasaBin.kreirajArtikal("Kava", "02", (new BigDecimal("8.8")), true);
        Artikal artikalBanana= kasaBin.kreirajArtikal("Banana", "03", (new BigDecimal("9.9")), true);


        kasaBin.dodajArtikal(kasa.asortimanArtikala,artikalMlijeko);
        kasaBin.dodajArtikal(kasa.asortimanArtikala,artikalKava);
        kasaBin.dodajArtikal(kasa.asortimanArtikala,artikalBanana);


        Stavka stavkaMlijeko= kasaBin.kreirajStavku(artikalMlijeko, 10);
        stavkaMlijeko.izmjenaCijeneFunkcija(new BigDecimal("4.0"));
        Stavka stavkaKava= kasaBin.kreirajStavku(artikalKava, 5);
        stavkaKava.izmjenaCijeneFunkcija(new BigDecimal("10.0"));


        Stavka stavkaBanana= kasaBin.kreirajStavku(artikalBanana, 2);
        stavkaBanana.izmjenaCijeneFunkcija((new BigDecimal("10.0")));


        Stavka stavkaBanana2= kasaBin.kreirajStavku(artikalBanana, 6);
        stavkaBanana2.izmjenaCijeneFunkcija(new BigDecimal("11.0"));

        Stavka stavkaBanana3= kasaBin.kreirajStavku(artikalBanana, 5);

        Stavka stavkaBanana4= kasaBin.kreirajStavku(artikalBanana, 2);
        stavkaBanana4.izmjenaCijeneFunkcija(new BigDecimal("10.0"));

        Stavka stavkaBanana5= kasaBin.kreirajStavku(artikalBanana, 2);
        stavkaBanana5.izmjenaCijeneFunkcija(new BigDecimal("10.0"));


        List<Stavka> listStavaka1= new ArrayList<>();
        List<Stavka> listStavaka2= new ArrayList<>();

        kasaBin.dodajSTavkuUListuStavaka(listStavaka1, stavkaMlijeko);
        kasaBin.dodajSTavkuUListuStavaka(listStavaka1,stavkaKava);

        kasaBin.dodajSTavkuUListuStavaka(listStavaka2, stavkaBanana);
        kasaBin.dodajSTavkuUListuStavaka(listStavaka2, stavkaBanana2);
        kasaBin.dodajSTavkuUListuStavaka(listStavaka2, stavkaBanana3);
        kasaBin.dodajSTavkuUListuStavaka(listStavaka2, stavkaBanana4);
        kasaBin.dodajSTavkuUListuStavaka(listStavaka2, stavkaBanana5);
        Racun racunJedan= kasaBin.kreirajRacun(1,listStavaka1);

        Racun racunDva= kasaBin.kreirajRacun(2,listStavaka2);

        kasaBin.dodajRacun(kasa.listaRacuna,racunJedan);
        kasaBin.dodajRacun(kasa.listaRacuna,racunDva);
        //kasaBin.obrisiRacun(kasa.listaRacuna,racunDva);


        kasaBin.IspisRacuna(kasa.listaRacuna);

    }


}