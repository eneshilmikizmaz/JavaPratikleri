package com.company.pratik;

public class TaksiMetre {
    private final double PERKM = 2.20;
    private final double STARTPRICE = 10.0;
    private final double MINPRICE = 20.0;

    public double calcFee(double km){
        double totalFee = STARTPRICE + (PERKM*km);
        if(totalFee<MINPRICE)
            return MINPRICE;
        return totalFee;
    }
}
