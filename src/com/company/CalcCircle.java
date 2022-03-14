package com.company;

public class CalcCircle {
    private final double PI = 3.14;
    private double r;

    public void setR(double r) {
        this.r = r;
    }

    public double calcArea(){
        double result = (double) PI*r*r;
        return result;
    }
    public double calcPerimeter(){
        double result = (double) 2*PI*r;
        return result;
    }

    public double calcCircleSlice(int a){
        double result = (PI*(r*r)*a)/360;
        return result;
    }
}
