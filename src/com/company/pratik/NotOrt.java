package com.company.pratik;

public class NotOrt {
    private int math, psyh, chmy, turk, music;

    public void setMath(int math) {
        this.math = math;
    }

    public void setPsyh(int psyh) {
        this.psyh = psyh;
    }

    public void setChmy(int chmy) {
        this.chmy = chmy;
    }

    public void setTurk(int turk) {
        this.turk = turk;
    }

    public void setMusic(int music) {
        this.music = music;
    }

    public String ortHesapla() {
        String str1 = "Sınıfı Geçti";
        String str2 = "Sınıfta Kaldı";
        int ort = (math + psyh + chmy + turk + music) / 5;
        boolean kosul = (ort >= 60);
        return kosul ? str1 : str2;
    }


}
