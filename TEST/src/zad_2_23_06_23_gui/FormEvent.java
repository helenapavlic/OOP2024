package zad_2_23_06_23_gui;

import java.util.EventObject;

public class FormEvent extends EventObject {
    String action;
    String name;
    String surname;
    String height;
    String country;


    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public FormEvent(Object source) {
        super(source);
    }

    public FormEvent(Object source, String action,String name, String surname, String height, String country) {
        super(source);
        this.action = action;
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getAction() {
        return action;
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
}
