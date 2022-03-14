package com.company;

public class ManavKasaProg {
    private final double ARMUTPRI = 2.14;
    private final double ELMAPRI = 3.67;
    private final double DOMATESPRI = 1.11;
    private final double MUZPRI = 0.95;
    private final double PATLICANPRI = 5.00;

    private int armutKg;
    private int elmaKg;
    private int domatesKg;
    private int muzKg;
    private int patlıcanKg;

    public void setArmutKg(int armutKg) {
        this.armutKg = armutKg;
    }

    public void setDomatesKg(int domatesKg) {
        this.domatesKg = domatesKg;
    }

    public void setElmaKg(int elmaKg) {
        this.elmaKg = elmaKg;
    }

    public void setMuzKg(int muzKg) {
        this.muzKg = muzKg;
    }

    public void setPatlıcanKg(int patlıcanKg) {
        this.patlıcanKg = patlıcanKg;
    }

    public double calcFee(){
        double result = (ARMUTPRI*armutKg) + (ELMAPRI*elmaKg) + (DOMATESPRI*domatesKg) + (MUZPRI*muzKg) + (PATLICANPRI*patlıcanKg);
        return result;
    }
}
