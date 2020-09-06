package com.company.javaasingment1;

import java.util.Scanner;

public class SwapConsecutiveInArray {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);

        System.out.println("Enter the num of element want in your array : ");
        int n = sc.nextInt();

        System.out.println("Enter the element Now");

        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int temp;
        int size;
        if (n%2 == 0)
        {
            size = n;
        }

        else size = n-1;

        for (int i = 0; i<size; i+=2)
        {
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }

        for (int e : arr){
            System.out.print(e + " ");
        }

    }
}
