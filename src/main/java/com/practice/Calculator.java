package com.practice;

public class Calculator {
    private long x;
    private long y;

    public Calculator(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public void setX(long x) {
        this.x = x;
    }

    public long getY() {
        return y;
    }

    public void setY(long y) {
        this.y = y;
    }

    public long add() {
        return x + y;
    }

    public long subtract() {
        return x - y;
    }

    public long multiply() {
        return x * y;
    }

    public long divide() {
        return x/y;
    }


}
