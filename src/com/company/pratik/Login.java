package com.company.pratik;

import java.util.Scanner;

public class Login {
    private final String USERNAME = "eneshk";
    private String password = "enes123";
    Scanner scanner = new Scanner(System.in);
    private boolean flag = false;

    private void setPassword(String password) {
        if (this.password.equals(password)) {
            System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz. !");
            passwordUpdate();
        } else {
            this.password = password;
            setFlag(true);
        }
    }

    private void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void passwordCheck(String pass, String user) {
        String questionYN = "";
        if (password.equals(pass) && USERNAME.equals(user)) {
            System.out.println("Giriş Başarılı !");
        } else if (password.equals(pass) == false) {
            System.out.println("Hatalı Şifre Girişi yaptınız !");
            System.out.println("Şifrenizi Sıfırlamak İster Misiniz? (Y/N) ");
            questionYN = scanner.nextLine();
            if (questionYN.equals("Y") || questionYN.equals("y")) {
                passwordUpdate();
            } else {
                System.exit(1);
            }
        } else if (USERNAME.equals(user) == false) {
            System.out.println("Hatalı Kullanıcı Adı !");
        }
    }

    private void passwordUpdate() {
        System.out.print("Yeni Şifrenizi Giriniz :");
        String newPass = scanner.nextLine();
        setPassword(newPass);
        if (flag == true) {
            System.out.println("Şifre oluşturuldu!");
            setFlag(false);
            scanner.close();

        }
    }

}

