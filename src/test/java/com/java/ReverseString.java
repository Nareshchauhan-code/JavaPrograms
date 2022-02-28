package com.java;

import java.util.Scanner;

public class ReverseString {

    void reverseString(String value) {

        String reverseValue = "";
        for (int i = value.length() - 1; i >= 0; i--) {

            reverseValue=reverseValue+value.charAt(i);
        }
        System.out.println(reverseValue);
    }

    public static void main(String[] args) {

        ReverseString ob = new ReverseString();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value");
        String value = sc.next();
        ob.reverseString(value);
    }
}
