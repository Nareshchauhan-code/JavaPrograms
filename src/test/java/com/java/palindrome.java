package com.java;

import java.util.Scanner;

public class palindrome {

    void palindromeString(String value) {

        String originalValue=value;

        String reverseValue = "";
        for (int i = value.length() - 1; i >= 0; i--) {

            reverseValue=reverseValue+value.charAt(i);
        }
        System.out.println(reverseValue);

        if(reverseValue.equalsIgnoreCase(originalValue)){

            System.out.println(originalValue+":"+"String is palindrome");

        }

        else {

            System.out.println(originalValue+":"+"String not palindrome");
        }
    }

    public static void main(String[] args) {

        palindrome ob = new palindrome();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value");
        String value = sc.next();
        ob.palindromeString(value);
    }
}
