package com.company;

public class HW44 {
    public static void main(String[] args) {

        int a = 10;
        int b = 60;
        int c = -45;


        if ( a>b && a>c ){
            System.out.println("max a");
        }
       else if ( b>a && b>c){
           System.out.println("max b");
       }
       else if (c>a && c>b){
           System.out.println("max c");
       }

    }
}
