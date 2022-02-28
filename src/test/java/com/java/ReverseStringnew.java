package com.java;

import java.util.Scanner;

public class ReverseStringnew {

    void reverseString(String value){

        String orginalValue=value;

        String reverseValue="";


        for(int i=value.length()-1; i>=0; i--){

            reverseValue=reverseValue+value.charAt(i);
        }

        System.out.println(reverseValue);

        if(orginalValue.equalsIgnoreCase(reverseValue)){

            System.out.println("String is Palindrome");
        }

        else {

            System.out.println("String is not Palindrome");
        }

    }

    public static void main(String[] args) {

        ReverseStringnew ob= new ReverseStringnew();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value");

        String value = sc.next();

        ob.reverseString(value);

    }
}
