package zad_1_07_07_23_gui;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Student implements Serializable {
    private int id;
    private String studentName;
    private String studentSurname;
    private String language;
    private ArrayList<String> coursesList;
    private String course;


    public Student(int id, String studentName, String studentSurname, String language, String course) {
        this.coursesList = new ArrayList<>();
        this.id = id;
        System.out.println("id: " + id);
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.language = language;
        this.course = course;
        System.out.println(course);
//        System.out.println(coursesList);
//        coursesList.add(course);
//        System.out.println(coursesList);
        AUX_CLS.addCourseToList(this,course);
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
        return coursesList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", language='" + language + '\'' +
                ", courses=" + coursesList +
                '}';
    }
}
