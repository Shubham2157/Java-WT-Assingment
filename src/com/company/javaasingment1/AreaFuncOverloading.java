package com.company.javaasingment1;

import java.util.Scanner;

public class AreaFuncOverloading {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter the Choice to find the Area\n1. Area of a Cube \n2. Area of a Rectangle\n3. Area Of circle");
        int ch = sc.nextInt();
        switch (ch)
        {
            case 1 :  System.out.println("Enter the the side of a cube");
                int n = sc.nextInt();
                Area(n);
                break;

            case 2 : System.out.println("Enter the the length & breadth of rectangle");
                int l = sc.nextInt();
                int b = sc.nextInt();
                Area(l,b);
                break;


            case 3:   System.out.println("Enter the the Radius of a circle");
                double r = sc.nextDouble();
                Area(r);
                break;

            default: System.out.println("Invalid choice");
        }

    }
    private static void Area(int a){
        System.out.println("The Area of Cube : " + a*a);
    }
    private static void Area(int l, int b){
        System.out.println("The Area of Cube : " + l*b);
    }
    private static void Area(double r){
        System.out.println("The Area of Circle : " + Math.PI*Math.pow(r,2));
    }
}
