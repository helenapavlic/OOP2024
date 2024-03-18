package pckg_this;

public class MainApp {
    public static void main(String[] args) {
        Student student1 = new Student("Mara", "L");
        String name = student1.getName();
        System.out.println("name is: " + name);
        System.out.println("id: " + student1.getId());


//        testiranje povratne metode klase
        Hlace nove = new Hlace("Levis", "501");
        System.out.println(nove);
        System.out.println("ciste: " + nove.isClear());
        Hlace polovne = nove.polovne();
        System.out.println(polovne);
        System.out.println("ciste: " + polovne.isClear());

//        promjena cisto, ne cisto
        polovne.setStatusClear();
        System.out.println("polovne ciste: " + polovne.isClear());

        nove.setStatusClear();
        System.out.println("nove ciste: " + nove.isClear());


//        otkači referencu sa prethodnog objekta i prikazuju na druge objekte
//        garbage collector će izbrisati objekre levis hlača (nove i polovne)
//        nove = new Hlace("Diesel", "Dw3");
//        polovne = new Hlace("H", "103");

        nove.operiMe(student1);
        System.out.println("nove ciste: " + nove.isClear());

    }
}
