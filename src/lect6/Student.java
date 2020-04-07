package lect6;

public class Student extends Person {
   final String TYPE_PERSON = this.getClass().getSimpleName();

   public Student(String name) {
       super(name);
       System.out.println(TYPE_PERSON);

   }

    @Override
    void print() {
        System.out.println("I am a " + super.getName());
    }
}
