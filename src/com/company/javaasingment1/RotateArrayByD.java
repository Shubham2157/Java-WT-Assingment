package com.company.javaasingment1;

import java.util.Scanner;

public class RotateArrayByD {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);

        System.out.println("Enter the num of element want in your array : ");
        int n = sc.nextInt();

        System.out.println("Enter the element Now");

        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the num to your array : ");
        int key = sc.nextInt();

        rotateArray(arr,n,key);

        for( int e : arr){
            System.out.print(e+" ");
        }

    }
    private static void rotateByOne(int[] a, int n)
    {
        int i, temp;
        temp = a[0];
        for (i = 0; i < n-1; i++)
            a[i] = a[i+1];
        a[i] = temp;
    }

    // repeat above function d times to rotate array
    private static void rotateArray(int[] a, int n, int d)
    {
        int i;
        for (i = 0; i < d; i++)
            rotateByOne(a, n);
    }
}
