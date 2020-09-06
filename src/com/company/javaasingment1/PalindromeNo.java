package com.company.javaasingment1;

import java.util.Scanner;

public class PalindromeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to Check whether the no is Palindrome or not");
        int n = sc.nextInt();
        boolean isPalindrome;
//        System.out.println(reverse(n));

        if (n == reverse(n)){
            isPalindrome = true;
        }
        else isPalindrome = false;

        if (isPalindrome){
            System.out.println("The Number "+ n +" is a Palindrome");
        }
        else System.out.println("The Number "+ n + " is not a Palindrome");

    }

    private static int reverse(int n){
        int rev = 0;
        while (n != 0){
            int rem = n%10;
            n = n/10;
            rev = rev * 10 +rem;
        }
        return rev;
    }
}
