package pckg_abs_class;

public abstract class Person {
    private static int cntId = 100;
    protected int id;
    protected String name;
    protected String surname;

//    napraviti private defaultni konstr -> ta klasa se ne može nikao instancirati
//    ovaj konstr služi za nasljednike klase

    protected Person(String name, String surname) {
        this.id = cntId;
        this.name = name;
        this.surname = surname;
//        kompajler zna da je objekt nastao u klasi koja nasljeđuje pa getclass i getsimplename je u ovom slučaju svjedno student
        System.out.println("constructor called: " + this.getClass().getSimpleName());
    }

    public void getInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    //    apstraktna metoda -> implementiraju je nasljednici klase
    protected abstract void getSignature();
}
