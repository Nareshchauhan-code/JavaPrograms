package com.java;

import java.util.Scanner;

public class NumberReverse {

    void reverseNumber(int num) {

        int reverse=0;

        while(num !=0){

            int reminder= num%10;
            reverse=reverse*10+reminder;
            num=num/10;
        }

        System.out.println(reverse);

    }

    public static void main(String[] args) {

        NumberReverse ob = new NumberReverse();
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter the number");
        int num = sc.nextInt();

        ob.reverseNumber(num);
    }
}
