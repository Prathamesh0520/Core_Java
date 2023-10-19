package com.testingacademy.oct17;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int a=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        a=sc.nextInt();

        if (a%2==0){
            System.out.println(a+" Is a Even Number");
        }
        else {
            System.out.println(a+" Is a Odd Number");
        }
    }
}
