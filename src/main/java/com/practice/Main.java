package com.practice;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n Hello welcome to the simple calculator app");
        System.out.println("\n What would you like to do? :)");
        System.out.println("\n a. Addition");
        System.out.println("\n b. Subtraction");
        System.out.println("\n c. Multiplication");
        System.out.println("\n d. Division");

        Calculator calculator = new Calculator(7, 9);
    }
}