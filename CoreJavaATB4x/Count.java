package com.testingacademy.oct17;

public class Count {
    public static void main(String[] args) {
        String s="This is the best which I can do";
        int count=0;
        for (int i = 0; i < s.length() ; i++) {
            if (s.charAt(i)!=(' '))
                System.out.println(s.charAt(i)+" "+i);
            count++;
        }
        System.out.println("Total Number of String is: "+count);
    }
}
