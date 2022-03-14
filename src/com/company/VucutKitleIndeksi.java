package com.company;

public class VucutKitleIndeksi {
    public double kilo;
    public double boy;

    public void setBoy(double boy) {
        this.boy = boy;
    }

    public void setKilo(double kilo) {
        this.kilo = kilo;
    }

    public double calcIndex(){
        double result = kilo / (boy*boy);
        return result;
    }
}
