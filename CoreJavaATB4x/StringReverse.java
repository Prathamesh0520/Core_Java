package com.testingacademy.oct17;

import java.io.*;
import java.util.Scanner;

class StringReverse {
    public static void main (String[] args) {

        String str= "Latest";
        String nstr="";


        System.out.print("Original word: ");
        System.out.println("Latest"); //Example word

        for (int i=0; i<str.length(); i++)
        {
            char ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr);
    }
}
