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

    public void add() {
        double r = x + y;
        System.out.println(r);
    }

    public void subtract() {
        double r = x - y;
        System.out.println(r);
    }

    public void multiply() {
        double r = x * y;
        System.out.println(r);
    }

    public void divide() {
        double r = x/y;
        System.out.println(r);
    }


}
