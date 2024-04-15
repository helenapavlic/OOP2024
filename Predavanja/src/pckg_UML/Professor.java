package pckg_UML;

public class Professor extends Person {
    private Student student;

    public Professor(String name, String surname) {
        super(name, surname);
    }

    //    setters za studenta -> asocijacila, kompozicija veza
    public void setStudent(Student student) {
        this.student = student;
    }

    public void performConsultation() {
        System.out.println(this.getClass().getSimpleName() + "gives consultation to student ");
        student.askQuestions();
    }
}
