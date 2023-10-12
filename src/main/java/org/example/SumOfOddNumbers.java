package org.example;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to calculate sum of odd numbers");
        int n = sc.nextInt();

        int sum = sumOfNOddNumbers(n);
        System.out.println("The sum of the n odd number is " +sum);

    }
    public static int sumOfNOddNumbers(int n)
    {
        int sum = 0;

        for (int i = 1; i<=n ; i++)
        {
            if(i % 2 != 0){
                sum = sum+1;
            }
        }
        return sum;
    }
}
