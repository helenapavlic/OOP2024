package gui_swing;

import java.util.EventObject;

public class ToolBarEvent extends EventObject {
    private String someString;

    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public ToolBarEvent(Object source) {
//        glavni konstruktor unutar kojeg se dogadaj dogada
        super(source);
    }

    public ToolBarEvent(Object source, String someString) {
        super(source);
        this.someString = someString;
    }

    public String getSomeString() {
        return someString;
    }

    //    klasa koja u sebi enkapsulira podatke o eventu
}
