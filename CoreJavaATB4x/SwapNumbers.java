package com.testingacademy.oct17;

public class SwapNumbers {
    public static void main(String[] args) {
        int a=10, b=20, temp=0;
        System.out.println("Before swap: "+a);
        System.out.println("Before swap: "+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swap: "+a);
        System.out.println("After swap: "+b);
        //System.out.println(temp);
    }
}
