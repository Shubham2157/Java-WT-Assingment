package com.company.javaasingment1;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to Check whether the no is Prime  or not");
        int n = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i*i<n; i++)
        // if the no is prime then it lies between 1 < factorial root under(n)

        {
            if (n%i == 0){
                isPrime = false;
                break;
            }
        }

        if (n<2)
            isPrime = false;

        if (isPrime){
            System.out.println("The Number " + n + " is a prime No");
        }
        else System.out.println("The Number " + n + " is not a prime No");

    }
}
