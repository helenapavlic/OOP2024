package pckg_this;

public class Student {

    private String name;
    private int id;
    private String surname;
    private String university;
    private static int cntID = 100;

    public Student(String name, String surname){
        this.name = name;
        this.surname = surname;
        System.out.println("name is: " + name);
        id = cntID++;
    }

    public Student(String name, String surname, String university){
        this(name, surname);
        this.university = university;
        this.id = cntID++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public Hlace operiHlace(Hlace hlace){
        System.out.println("Student pere hlace...");
        hlace.setClear();
        return hlace;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
