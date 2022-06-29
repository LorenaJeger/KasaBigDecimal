package main.java;

import java.util.ArrayList;
import java.util.List;

public class Kasa  {


    private final  List<Artikal> asortimanArtikala= new ArrayList<>();
    private final  List<Racun> listaRacuna=new ArrayList<>();


    public List<Artikal> getAsortimanArtikala() {
        return asortimanArtikala;
    }

    public List<Racun> getListaRacuna() {
        return listaRacuna;
    }

}
