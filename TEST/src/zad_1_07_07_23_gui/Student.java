package zad_1_07_07_23_gui;

import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {
    private static int cntId = 1;
    private int id;
    private String studentName;
    private String studentSurname;
    private String language;
    private ArrayList<String> courses;




    public Student( String studentName, String studentSurname, String language, ArrayList<String> courses) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.language = language;
        this.courses = courses;
        id = cntId++;
    }

    public int getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public String getLanguage() {
        return language;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }
}
