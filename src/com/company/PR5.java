package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class PR5 {

    public static void main(String[] args) {
        Employee[] emps = new Employee[5];
        emps[0] = new Employee("Lola", 1, 15000);
        emps[1] = new Employee("Petr", 1, 20000);
        emps[2] = new Employee("Helena", 2, 100000);
        emps[3] = new Employee("Sasha", 2, 90999);
        emps[4] = new Employee("Alina", 1, 91000);
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int dep = scanner.nextInt();
        for (Employee e : emps
        ) {
            if (dep == e.getDepartmentNumber()) {
                System.out.println(e.getName());
            }

        }
        Employee tmp;
        for (int i = 0; i < emps.length - 1; i++) {
            for (int j = i + 1; j < emps.length; j++) {
                if (emps[i].getSalary() < emps[j].getSalary()) {
                    tmp = emps[i];
                    emps[i] = emps[j];
                    emps[j] = tmp;
                }
            }
        }
        for (int i = 0; i < emps.length; i++) {
            System.out.println(emps[i]);


        }
    }
}
