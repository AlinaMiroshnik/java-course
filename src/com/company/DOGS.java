package com.company;


import javax.print.DocFlavor;

public class DOGS{

    public static void main(String[] args) {
        Dog dog1 = new Dog ("Nora", 7, Breed.LABRADOR );
        Dog dog2 = new Dog ("Doggi", 6, Breed.POODLE );
        Dog dog3 = new Dog ("Graf", 1, Breed.SPITZ );

        if(dog1.equals(dog2) | dog1.equals(dog3) | dog2.equals(dog3)) {
            System.out.println("Two dogs with the same name");
        }
        else {
            System.out.println("No dogs with the same name");
        }

        Dog olderDog = null;

        if(dog1.getAge()>dog2.getAge() & dog1.getAge()>dog3.getAge()){
            olderDog = dog1;
        }
        else if (dog2.getAge()>dog1.getAge() & dog2.getAge()>dog3.getAge()){
            olderDog =dog2;
        }
        else if (dog3.getAge()>dog1.getAge() & dog3.getAge()>dog2.getAge()){
            olderDog = dog3;
        }

        if (olderDog != null){
            System.out.println("Oldest dog" +olderDog.getName()+" "+olderDog.getBreed());
        }
        else {
            System.out.println("All dogs has the same age");
        }

    }



}
