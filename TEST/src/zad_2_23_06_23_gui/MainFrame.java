package zad_2_23_06_23_gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private String filePath = "TEST/src/zad_2_23_06_23_gui/person.bin";
    private ViewPanel viewPanel;
    private FormPanel formPanel;
    private Person person;
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
        setSize(400, 600);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void activateComponents() {
        formPanel.setLeftFormListener(new FormListener() {
            @Override
            public void formEventOccurred(FormEvent formEvent) {
                if (formEvent.getAction().equals("SAVE")){
                    System.out.println("saveee");

                    String name = formEvent.getName();
                    String surname = formEvent.getSurname();
                    String height = formEvent.getHeight();
                    String country = formEvent.getCountry();

                    Person person = new Person(name,surname,height,country);
                    AUX_CLS.saveObjectToFile(filePath,person);
                    System.out.println(person);


                } else if (formEvent.getAction().equals("SHOW")) {
                    System.out.println("shooooooooooow");
                    person = AUX_CLS.readObjectFromFile(filePath);
                    System.out.println(person);
                    viewPanel.setText(person.toString());


                }
            }
        });
//        formPanel.setFormListener(new FormPanelListener() {
//            @Override
//            public void formPanelEventOccurred(FormPanelEvent formPanelEvent) {
//                if (formPanelEvent.getAction().equals("CONFIRM")) {
//
//                    int id = formPanelEvent.getId();
//                    String name = formPanelEvent.getStudentName();
//                    String surname = formPanelEvent.getStudentSurname();
//                    String selectedLang = "HR";
//                    if (formPanelEvent.isSelectedEng()) {
//                        selectedLang = "EN";
//                    }
//                    String course = formPanelEvent.getCourses();
//
//                    if (!addedStudents.containsKey(id)){
//                        student = new Student(id,name,surname,selectedLang,course);
//                        addedStudents.put(id,student);
//                    } else {
//                        AUX_CLS.addCourseToList(student,course);
//                    }
//                    viewPanel.setText(student.toString());
//
//                } else if (formPanelEvent.getAction().equals("SAVE")) {
//                    System.out.println("save button");
//
//                    int id = formPanelEvent.getId();
//                    String name = formPanelEvent.getStudentName();
//                    String surname = formPanelEvent.getStudentSurname();
//                    String selectedLang = "HR";
//                    if (formPanelEvent.isSelectedEng()) {
//                        selectedLang = "EN";
//                    }
//                    String course = formPanelEvent.getCourses();
//
//                    if (!addedStudents.containsKey(id)){
//                        student = new Student(id,name,surname,selectedLang,course);
//                        addedStudents.put(id,student);
//                    } else {
//                        AUX_CLS.addCourseToList(student,course);
//                    }
//                    AUX_CLS.saveObjectToFile(filePath,student);
//                    viewPanel.resetViewPanel();
//
//                } else if (formPanelEvent.getAction().equals("IMPORT")) {
//                    System.out.println("import button pressed");
//
//                    student = AUX_CLS.readObjectFromFile(filePath);
//
//                    String textToPrint = student.toString();
//                    viewPanel.setText(textToPrint);
//                } else {
//                    System.out.println("toolbar error");
//                }
//            }
//        });
    }

    private void createComponentsMainFrame() {
        formPanel = new FormPanel();
        viewPanel = new ViewPanel();
    }
}
