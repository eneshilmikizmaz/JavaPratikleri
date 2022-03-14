package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        //Not Ortalaması Pratiği
        /*
        NotOrt pratik1 = new NotOrt();
        System.out.println("Matematik Notunu Giriniz:");
        pratik1.setMath(scanner.nextInt());
        System.out.println("Fizik Notunu Giriniz    :");
        pratik1.setPsyh(scanner.nextInt());
        System.out.println("Kimya Notunu Giriniz    :");
        pratik1.setChmy(scanner.nextInt());
        System.out.println("Türkçe Notunu Giriniz   :");
        pratik1.setTurk(scanner.nextInt());
        System.out.println("Müzik Notunu Giriniz    :");
        pratik1.setMusic(scanner.nextInt());
        System.out.println(pratik1.ortHesapla());
        */


        //KDV Hesaplama Pratiği,
        /*
        KdvHesaplama hesap = new KdvHesaplama();
        System.out.println("Tutarı giriniz:");
        System.out.println("KDV Tutarı :"+hesap.kdvTutar(scanner.nextDouble()));
        */

        //Ucgen Alan Hesaplama
        /*
        UcgenAlani ucgen = new UcgenAlani();
        System.out.println("1. Kenar :");
        ucgen.setA(scanner.nextInt());
        System.out.println("2. Kenar :");
        ucgen.setB(scanner.nextInt());
        System.out.println("3. Kenar :");
        ucgen.setC(scanner.nextInt());
        System.out.print("Üçgenin alanı = ");
        System.out.println(ucgen.alanHesapla());
         */

        //TaksiMetre
        /*
        TaksiMetre taksi = new TaksiMetre();
        System.out.println("Kaç Km yolculuk yapıldığını giriniz (,)= ");
        System.out.println(taksi.calcFee(scanner.nextDouble()));
        */

        //Daire Alan, Çevre ve Daire Dilimi Hesabı
        /*
        CalcCircle circle = new CalcCircle();
        System.out.println("Dairenin yarı çapını giriniz = ");
        circle.setR(scanner.nextInt());
        System.out.println("Dairenin Alanı :" + circle.calcArea());
        System.out.println("Dairenin Çevresi :" + circle.calcPerimeter());
        System.out.println("Daire diliminin açısını giriniz :");
        System.out.println("Daire diliminin alanı: " + circle.calcCircleSlice(scanner.nextInt()));
    */
        //Vücut Kitle indeksi
        /*
        VucutKitleIndeksi insan = new VucutKitleIndeksi();
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        insan.setBoy(scanner.nextDouble());
        System.out.print("Lütfen kilonuzu giriniz :");
        insan.setKilo(scanner.nextDouble());
        System.out.println("Vücut Kitle İndeksiniz :"+ insan.calcIndex());
        */

        ManavKasaProg manav = new ManavKasaProg();
        System.out.print("Armut Kaç Kilo ? :");
        manav.setArmutKg(scanner.nextInt());
        System.out.print("Elma Kaç Kilo ? :");
        manav.setElmaKg(scanner.nextInt());
        System.out.print("Domates Kaç Kilo ? :");
        manav.setDomatesKg(scanner.nextInt());
        System.out.print("Muz Kaç Kilo ? :");
        manav.setMuzKg(scanner.nextInt());
        System.out.print("Patlıcan Kaç Kilo ? :");
        manav.setPatlıcanKg(scanner.nextInt());
        System.out.println("Toplam Tutar : " + manav.calcFee());
    }

}
