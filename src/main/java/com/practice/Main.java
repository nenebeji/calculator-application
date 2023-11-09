package com.practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Hello welcome to the simple calculator app");
        System.out.println("\n What would you like to do? :)");
        System.out.println("\n a. Addition");
        System.out.println("\n b. Subtraction");
        System.out.println("\n c. Multiplication");
        System.out.println("\n d. Division");
        String option = scanner.nextLine();

        Scanner scannerX = new Scanner(System.in);
        System.out.println("\n Please input your first number");
        double x = scannerX.nextDouble();

        Scanner scannerY = new Scanner(System.in);
        System.out.println("\n Please input your second number");
        double y = scannerY.nextDouble();

//        System.out.println(x);
//        System.out.println(y);


        Calculator calculator = new Calculator(x, y);
        calculator.add();
        calculator.subtract();
        calculator.multiply();
        calculator.divide();
    }
}