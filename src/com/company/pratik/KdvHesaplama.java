package com.company.pratik;

public class KdvHesaplama {
    private final double KDV18 = 0.18;
    private final double KDV08 = 0.08;

    public double kdvTutar(double money) {
        if (money > 0) {
            if (money < 1000) {
                return KDV18 * money;
            } else if (money >= 1000) {
                return KDV08 * money;
            }

        } else {
            System.out.println("Geçerli bir tutar giriniz!");
            return 0;
        }
        return 0;
    }
}

