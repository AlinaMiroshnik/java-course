package com.company;

public class POSITIVE {
    public static void main(String[] args) {
        int[] items = {1, 2, -3, 4, -5, 6, 7, 8, 9, 10};
        int sum = 0;
        int amount = 0;
        for (int i = 0; i < items.length; i++){
            System.out.println(items);
            if(items[i]>0){
                sum += items[i];
            }else {
                amount++;
            }
        }
        System.out.println(sum);
        System.out.println(amount);
    }




    }




