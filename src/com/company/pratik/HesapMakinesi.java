package com.company.pratik;

public class HesapMakinesi {
    private final int TOPLAMA (int a, int b){
        System.out.print(a + " + " + b + " = " );
        return a+b;
    }
    private  final int CARPMA (int a, int b){
        System.out.print(a + " * " + b + " = " );
        return a*b;
    }
    private final int BOLME (int a, int b){
            if(b==0){
                System.out.println("Hatalı İşlem !");
                return 0;
            }
            System.out.print(a + " / " + b + " = " );
            return a/b;

    }
    private  final int CIKARMA(int a, int b){
        System.out.print(a + " - " + b + " = " );
        return a-b;
    }
    private int a=0;
    private int b=0;
    private int secim=0;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setSecim(int secim) {
        this.secim = secim;
    }

    public void hesapMakinesi(){
        switch (secim) {
            case 1:
                System.out.println(TOPLAMA(a, b));
                break;
            case 2:
                System.out.println(CIKARMA(a, b));
                break;
            case 3:
                System.out.println(CARPMA(a, b));
                break;
            case 4:
                System.out.println(BOLME(a, b));
                break;
            case 5:
                break;
            default:
                System.out.println("Hatalı Giriş!");
                break;
        }

    }
}
