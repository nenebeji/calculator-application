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

    public long add(long x, long y) {
        return x + y;
    }

    public long subtract(long x, long y) {
        return x - y;
    }

    public long multiply(long x, long y) {
        return x * y;
    }

    public long divide(long x, long y) {
        return x/y;
    }


}
