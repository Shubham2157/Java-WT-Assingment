package com.company.javaasingment1;

import java.util.Scanner;

public class FactorialOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to find its Factorial");
        int n = sc.nextInt();
        int fact = 1;
        while (n>0){
            fact *= n;
            n--;
        }
        System.out.println(fact);
    }
}
