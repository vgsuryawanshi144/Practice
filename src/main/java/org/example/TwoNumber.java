package org.example;

import java.util.Scanner;

public class TwoNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculateGreaterNumber(a, b);
    }

    public static void calculateGreaterNumber(int a, int b) {

        if (a > b) {
            System.out.println("a is greater than b ");
        } else {
            System.out.println("B is greater than c");
        }
    }
}
