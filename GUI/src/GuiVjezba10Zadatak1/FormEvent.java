package GuiVjezba10Zadatak1;

import java.util.EventObject;

public class FormEvent extends EventObject {
    private String text;

    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public FormEvent(Object source) {
        super(source);
        System.out.println("constructor of form event");
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
