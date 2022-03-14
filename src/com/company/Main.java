package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
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
    }
}
