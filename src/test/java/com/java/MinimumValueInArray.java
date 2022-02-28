package com.java;

public class MinimumValueInArray {

    public static void main(String[] args) {

        int [] a= {100,20,500,50,70,90};

        int minimum=a[0];

        for(int i=1; i<a.length;i++){

            if(minimum>a[i]){

                minimum=a[i];
            }
        }
        System.out.println(minimum);
    }
}
