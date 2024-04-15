package pckg_UML;

public class Student extends Person {

    public Student(String name, String surname) {
        super(name, surname);
    }

    public void askQuestions() {
        System.out.println("student: " + this.name + " ask questions...");
    }

}
