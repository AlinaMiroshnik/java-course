package lect6;

public class Cat extends Animals implements Animal{
    private String name;

    @Override
    public void feed() {
        System.out.println("Cat is animal Feed");
    }

    @Override
    public void voice() {
        System.out.println("Cat do Myau");

    }

    public Cat(){

    }
    public Cat(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
