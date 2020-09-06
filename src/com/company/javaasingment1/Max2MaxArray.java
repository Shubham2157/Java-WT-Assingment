package com.company.javaasingment1;

import java.util.Arrays;
import java.util.Scanner;

public class Max2MaxArray {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);

        System.out.println("Enter the num of element want in your array : ");
        int n = sc.nextInt();

        System.out.println("Enter the element Now");

        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            if (arr[i]<0){
                System.out.println("Please enter only Positive Number");
                break;
            }
        }

        System.out.println("**************1st Method*****************");

        int maximum = maxOfArray(arr,n);
        int maximum2 = max2OfArray(arr,n,maximum);



        System.out.println("Maximum Number in An Array = "+ maximum + "\n2nd Maximum number in Array = " + maximum2);

        System.out.println("**************2nd Method*****************");
        // we will sort array and then we put last index in max and 2nd last index to 2nd max
        Arrays.sort(arr);
        int max = arr[n-1];
        int max2 = arr[n-2];

        System.out.println("Maximum Number in An Array = "+ max + "\n2nd Maximum number in Array = " + max2);

    }
    private static int maxOfArray(int[] a, int n){
        int max = a[0];
        for(int i = 1; i<n; i++){
            if (a[i]>max){
                max = a[i];
            }
        }
        return max;
    }
    private static int max2OfArray(int[] a,int n, int max){
        int max2 = a[0];
        for (int i = 1; i<n; i++){
            if (a[i]>max2 && a[i]<max){
                max2=a[i];
            }
        }
        return max2;
    }
}
