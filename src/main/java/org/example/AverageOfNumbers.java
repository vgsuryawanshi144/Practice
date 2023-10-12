package org.example;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int avg = printAverageOfNumbers(a, b, c);
        System.out.println("The average of the three numbers is: " + avg);
    }

    public static int printAverageOfNumbers(int a, int b, int c)
    {
         return (a+b+c)/3;
    }
}
