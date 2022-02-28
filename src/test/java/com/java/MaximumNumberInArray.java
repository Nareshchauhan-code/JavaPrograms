package com.java;

public class MaximumNumberInArray {

    public static void main(String[] args) {

        int [] a= {100,20,500,50,70,90};

        int maximum=a[0];

        for(int i=1; i<a.length;i++){

            if(maximum<a[i]){

                maximum=a[i];
            }
        }
        System.out.println(maximum);
    }
}
