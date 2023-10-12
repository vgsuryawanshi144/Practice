package org.example;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius to calculate area of circle");
        int radius = sc.nextInt();

        double area = (radius*radius)*Math.PI;
        System.out.println("Area of circle is :" +area);
    }
}
