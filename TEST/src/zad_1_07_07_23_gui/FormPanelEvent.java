package zad_1_07_07_23_gui;

import java.util.EventObject;

public class FormPanelEvent extends EventObject {

    private int id;
    private String studentName;
    private String studentSurname;
    private boolean selectedHr;
    private boolean selectedEng;
    private String courses;
    private String action;

    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public FormPanelEvent(Object source) {
        super(source);
    }

    public FormPanelEvent(Object source, String action) {
        super(source);
        this.action = action;
    }

    public FormPanelEvent(Object source, String action, int id, String studentName, String studentSurname, boolean selectedHr, boolean selectedEng, String courses) {
        super(source);
        this.action = action;
        this.id = id;
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.selectedHr = selectedHr;
        this.selectedEng = selectedEng;
        this.courses = courses;
    }

    public String getAction() {
        return action;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public boolean isSelectedEng() {
        return selectedEng;
    }

    public String getCourses() {
        return courses;
    }
}
