package com.company.pratik;

public class UcgenAlani {
    private int a, b, c;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double alanHesapla(){
        double u = (a+b+c) / 2;
        double formul = u*(u-a)*(u-b)*(u-c);
        double alan = Math.sqrt(formul);
        return alan;
    }
}

