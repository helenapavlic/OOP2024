package pckg_UML;

public class Person {

    protected String name;
    protected String surname;
    protected int id;
    private static int cntId = 100;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.id = cntId++;
        System.out.println(this.getClass().getSimpleName() + " constr called");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                '}';
    }
}
