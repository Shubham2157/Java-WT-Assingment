package com.company.javaasingment1;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num tp find the num is armstrong or not : ");
        int n = sc.nextInt();
        int temp = n;
        boolean isArmstrong;

        int revsumCube = 0;

        while (temp > 0){
            int rem = temp%10;
            int cube  = (int) Math.pow(rem, 3);
            revsumCube += cube;
//            System.out.println(rev);
            temp /= 10;

        }

//        System.out.println(sumCube);

        if(n == revsumCube){
            isArmstrong = true;
        }
        else isArmstrong = false;

        if (isArmstrong){
            System.out.println("The Number " + n + " is Armstrong Num");
        }
        else System.out.println("The Number " + n + " is not a Armstrong Num");
    }
}
