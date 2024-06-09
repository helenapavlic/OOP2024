package zad_2_23_06_23_gui;

import java.io.Serializable;

public class Person implements Serializable {
    private int id;
    private static int cntId = 1;
    private String name;
    private String surname;
    private String height;
    private String country;

    public Person(String name, String surname, String height, String country) {
        this.id = cntId++;
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getHeight() {
        return height;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", height='" + height + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
