package com.company;

import java.util.Random;

public class Country {

    public static void main(String[] args){
        Country main = new Country();
        Random random = new Random();
        int countryNumber = random.nextInt(4)+ 1;
        System.out.println(countryNumber);
        main.choseCountry(countryNumber);
    }

    public void choseCountry (int num){
        switch (num){
            case 1:
                System.out.println(Continents.Africa.get());
                break;
            case 2:
                System.out.println(Continents.Asia.get());
                break;
            case 3:
                System.out.println(Continents.Europe.get());
                break;
            case 4:
                System.out.println(Continents.SouthAmerica.get());
                break;
            default:
                System.out.println("other countries");
                break;


        }
    }
}

