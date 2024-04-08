package pckg_UML;

public class MainApp {
    public static void main(String[] args) {
        Person person = new Person("Matija", "Martinić");
        Student student = new Student("Eva", "Franić");
        Professor professor = new Professor("Stipe", "Gverić");
        professor.setStudent(student);
        professor.performConsultation();
    }
}
