
package com.company;

public class OOP1 {

    public static void main(String[] args) {
        Person person1 = new Person("Alina", "Miroshnik",1998);
        Person person2 = new Person("Dasha", "Bob",1990);
        Person person3 = new Person("Filya", "Kola",1989);
        Person person4 = new Person("Tamara", "Popkina",1925);
        Person person5 = new Person("Olga", "Loboda",2004);


        person1.changeName("Nina");
        System.out.println(person1);
        person2.changeName("Kara");
        System.out.println(person2);
        person3.changeName("Sveta");
        System.out.println(person3);
        person4.changeName("Rita");
        System.out.println(person4);
        person5.changeName("Lera");
        System.out.println(person5);




        System.out.println("firstName=" + person1.getFirstName() + "," +
                "lastName=" + person1.getLastName() + "," +
                "birthYear=" + person1.getAge());
        System.out.println("firstName=" + person2.getFirstName() + "," +
                "lastName=" + person2.getLastName() + "," +
                "birthYear=" + person2.getAge());
        System.out.println("firstName=" + person3.getFirstName() + "," +
                "lastName=" + person3.getLastName() + "," +
                "birthYear=" + person3.getAge());
        System.out.println("firstName=" + person4.getFirstName() + "," +
                "lastName=" + person4.getLastName() + "," +
                "birthYear=" + person4.getAge());
        System.out.println("firstName=" + person5.getFirstName() + "," +
                "lastName=" + person5.getLastName() + "," +
                "birthYear=" + person5.getAge());
    }
}

