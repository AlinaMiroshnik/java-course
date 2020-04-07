package lect6;

import java.util.Arrays;

public class Lect6 {
    public static void main(String[] args){
        Sobaka sobaka = new Sobaka();
        Cat cat = new Cat();
        Animals[]animalss =new Animals[8];
        animalss[0] = new Cat("Lola");
        animalss[1] = new Sobaka("Sharik");
        animalss[2] = new Cat("Pip");
        animalss[3] = new Sobaka("Ola");
        animalss[4] = new Cat("Kira");
        animalss[5] = new Sobaka("Watson");
        animalss[6] = new Cat("Sofa");
        animalss[7] = new Sobaka("Tolik");
        System.out.println(Arrays.toString(animalss));

        for (Animals animals : animalss) {
            System.out.println(animals);
        }

        Test test = new Test();
        test.foo(cat);
        test.foo(sobaka);

    }
}
