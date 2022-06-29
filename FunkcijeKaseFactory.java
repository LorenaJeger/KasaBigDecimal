package main.java;

public class FunkcijeKaseFactory{
    private static FunkcijeKaseFactory instance;
    private FunkcijeKaseFactory(){};
    public static FunkcijeKaseFactory getInstance(){
        if(instance==null) instance= new FunkcijeKaseFactory();
        return instance;
    }

    public Funkcije createFunkcijeKase() {
        Funkcije funkcijeKase = new FunkcijeKase();
        return funkcijeKase;
    }




}