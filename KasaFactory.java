package main.java;

public class KasaFactory {
    private static KasaFactory instance;
    private KasaFactory(){};

    public static KasaFactory getInstance(){
        if(instance==null) instance= new KasaFactory();
        return instance;
    }

    public Kasa createKasa() {
        Kasa kasa = new Kasa();
        return kasa;
    }
}
