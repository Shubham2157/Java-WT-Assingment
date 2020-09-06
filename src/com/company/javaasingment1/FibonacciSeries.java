package com.company.javaasingment1;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num to find the Fibonacci Series");
        int num = sc.nextInt();
        int n1 = 0;
        int n2 = 1;

        System.out.print("0 1");

        for(int i = 1; i<num; i++){
            int res  = n1 + n2;
            System.out.print(" "+res);
            n1 = n2;
            n2 = res;
        }
    }
}
