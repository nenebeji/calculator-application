package com.practice;

import java.util.Scanner;

public class Main {
     static String option;
    public static void options() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Hello welcome to the simple calculator app");
        System.out.println("\n What would you like to do? :)");
        System.out.println("\n a. Addition");
        System.out.println("\n b. Subtraction");
        System.out.println("\n c. Multiplication");
        System.out.println("\n d. Division");
        option = scanner.nextLine();
    }

    private static void restart(String[] strArr) {
        main(strArr);
    }
    public static void main(String[] args) {
        options();
        Scanner scannerX = new Scanner(System.in);
        System.out.println("\n Please input your first number");
        double x = scannerX.nextDouble();

        Scanner scannerY = new Scanner(System.in);
        System.out.println("\n Please input your second number");
        double y = scannerY.nextDouble();

        Calculator calculator = new Calculator(x, y);
        switch (option) {
            case "a", "A":
                calculator.add();
                break;

            case "b", "B":
                calculator.subtract();
                break;

            case "c", "C":
                calculator.multiply();
                break;

            case "d", "D":
                calculator.divide();
                break;

            default:
                System.out.println("Please select from the options provided");
                restart(args);
        }

    }
}