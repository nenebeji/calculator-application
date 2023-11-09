package com.practice;

public class Calculator {
    private double x;
    private double y;

    public Calculator(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double add() {
        double r = x + y;
        System.out.println(r);
        return r;
    }

    public double subtract() {
        double r = x - y;
        System.out.println(r);
        return r;
    }

    public double multiply() {
        double r = x * y;
        System.out.println(r);
        return r;
    }

    public double divide() {
        double r = x/y;
        System.out.println(r);
        return r;
    }


}
