package vjezba5_naSatu;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Student {
    private DateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy");
    protected Date enrolmentDate;
    protected String name;
    protected int idStudent;
    protected static int cntStudent = 1;
    private Scanner sc;

    protected void setEnrolmentDate() throws ParseException {
        System.out.println("Please enter enrollment data in the format dd-MM-yyy");
        String date = sc.nextLine();
        this.enrolmentDate = DATE_FORMAT.parse(date);
    }

    public void setScanner(Scanner sc){
        this.sc = sc;
    }

    protected void infoStudent(){
        System.out.println("Student: " + this.name + " - id: " + this.idStudent);
        System.out.println("Student enrolment date - " + enrolmentDate.toString());
    }

    protected abstract void completedStudy(int idStudent);

    @Override
    public String toString() {
        return "Student{" +
                "DATE_FORMAT=" + DATE_FORMAT +
                ", enrolmentDate=" + enrolmentDate +
                ", name='" + name + '\'' +
                ", idStudent=" + idStudent +
                '}';
    }
}
