package lect6;

import java.util.Arrays;

public class lectzia6 {
    public static void main(String[] args){ ;
        Person[]people = new Person[9];
        people[0] = new Student("Vasya");
        people[1] = new Student("Petya");
        people[2] = new Student("Lika");
        people[3] = new Teacher("Olga", 5000);
        people[4] = new Teacher("Anatoliy",4000);
        people[5] = new Teacher("Petro", 3000);
        people[6] = new Cleaner("Helena", 6000);
        people[7] = new Cleaner("Nina", 10000);
        people[8] = new Cleaner("Galya",4500);



        for (Person person: people) {
           person.print();
           if (person instanceof Staff){
               Staff staff = (Staff) person;
               staff.salary();
           }
        }


        /*Student student = new Student();
        student.print();
        Teacher teacher = new Teacher("Olga");
        teacher.print();
        teacher.salary();
        Cleaner cleaner = new Cleaner("Helena");
        cleaner.print();
        cleaner.salary();*/

    }
}
