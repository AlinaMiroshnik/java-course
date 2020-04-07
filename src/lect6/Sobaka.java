package lect6;

public class Sobaka extends Animals implements Animal {
    private String name;

    @Override
    public void feed() {
        System.out.println("Sobaka is animal Feed");

    }

    @Override
    public void voice() {
        System.out.println("Sobaka do Woof");

    }

    public Sobaka(){

    }

    public Sobaka(String name){
        this.name = name;



    }

    @Override
    public String toString() {
        return "Sobaka{" +
                "name='" + name + '\'' +
                '}';
    }
}
