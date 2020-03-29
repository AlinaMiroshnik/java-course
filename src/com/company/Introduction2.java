package com.company;

import java.util.Scanner;

public class Introduction2 {

    public static void main(String[] args) {

        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Where are you live, Alina?");
        String live = scanner.nextLine();
        System.out.println(name);
        System.out.println(live);
    }
}
