package main.java;

public class StavkaFactory {

    private static StavkaFactory instance;
    private StavkaFactory(){};
    public static StavkaFactory getInstance(){
        if(instance==null) instance= new StavkaFactory();
        return instance;

    }

    public Stavka createStavka(final Artikal a, final int kolicina){
        if(a.getPromjenjivaCijena()) {
            Stavka stavka= new StavkaPromjenjivaCijena(a,kolicina);
            return stavka;
        }
        else {
            Stavka stavka= new Stavka(a,kolicina);
            return stavka;
        }

    }



}
