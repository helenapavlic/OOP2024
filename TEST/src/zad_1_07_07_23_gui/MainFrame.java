package zad_1_07_07_23_gui;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class MainFrame extends JFrame {
    HashMap<Integer,Student> addedStudents = new HashMap<>();

    private FormPanel formPanel;
    private ViewPanel viewPanel;
    private Student student;
    String filePath = "TEST/src/zad_1_07_07_23_gui/student.bin";


    public MainFrame() {
        super("Simple App");
        initMainFrame();
        createComponentsMainFrame();
        layoutComponents();
        activateComponents();
    }

    private void layoutComponents() {
        setLayout(new BorderLayout());
        add(viewPanel, BorderLayout.CENTER);
        add(formPanel, BorderLayout.SOUTH);
    }

    private void initMainFrame() {
        setSize(680, 580);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void activateComponents() {
        formPanel.setFormListener(new FormPanelListener() {
            @Override
            public void formPanelEventOccurred(FormPanelEvent formPanelEvent) {
                if (formPanelEvent.getAction().equals("CONFIRM")) {

                    int id = formPanelEvent.getId();
                    String name = formPanelEvent.getStudentName();
                    String surname = formPanelEvent.getStudentSurname();
                    String selectedLang = "HR";
                    if (formPanelEvent.isSelectedEng()) {
                        selectedLang = "EN";
                    }
                    String course = formPanelEvent.getCourses();

                    if (!addedStudents.containsKey(id)){
                        student = new Student(id,name,surname,selectedLang,course);
                        addedStudents.put(id,student);
                    } else {
                        AUX_CLS.addCourseToList(student,course);
                    }
                    viewPanel.setText(student.toString());

                } else if (formPanelEvent.getAction().equals("SAVE")) {
                    System.out.println("save button");

                    int id = formPanelEvent.getId();
                    String name = formPanelEvent.getStudentName();
                    String surname = formPanelEvent.getStudentSurname();
                    String selectedLang = "HR";
                    if (formPanelEvent.isSelectedEng()) {
                        selectedLang = "EN";
                    }
                    String course = formPanelEvent.getCourses();

                    if (!addedStudents.containsKey(id)){
                        student = new Student(id,name,surname,selectedLang,course);
                        addedStudents.put(id,student);
                    } else {
                        AUX_CLS.addCourseToList(student,course);
                    }
                    AUX_CLS.saveObjectToFile(filePath,student);
                    viewPanel.resetViewPanel();

                } else if (formPanelEvent.getAction().equals("IMPORT")) {
                    System.out.println("import button pressed");

                    student = AUX_CLS.readObjectFromFile(filePath);

                    String textToPrint = student.toString();
                    viewPanel.setText(textToPrint);
                } else {
                    System.out.println("toolbar error");
                }
            }
        });
    }

    private void createComponentsMainFrame() {
        formPanel = new FormPanel();
        viewPanel = new ViewPanel();
    }
}
