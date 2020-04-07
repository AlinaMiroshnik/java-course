package lect6;

public class Teacher extends Staff {
    final String TYPE_PERSON = this.getClass().getSimpleName();

    public Teacher(String name, int salary){
        super(name, salary);
        System.out.println(TYPE_PERSON);
    }

    @Override
    void salary() {
        System.out.println("My salary:" + super.getSalary());
    }

    @Override
    void print() {
        System.out.println("I am a " +super.getName());
    }
}



