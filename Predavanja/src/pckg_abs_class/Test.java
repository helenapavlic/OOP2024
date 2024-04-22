package pckg_abs_class;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("Iva", "M", "unizd", "it");
//        Student student1 = new Student("Maja", "K", "unizg", "tvz");
        student.getSignature();
//        student1.getSignature();
        student.getInfo();
//        student1.getInfo();

        SuperHero superHero = new SuperHero("anonimous","nosurname", "batman");
        superHero.flyAroundTown();
        superHero.getSignature();
        superHero.haveEnourmousStrenght(10);

    }
}
