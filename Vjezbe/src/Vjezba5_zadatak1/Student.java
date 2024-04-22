package Vjezba5_zadatak1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Student {
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy");
    protected static int cntStudent = 100;
    protected Date enrolmentDate;
    protected String name;
    protected int idStudent;
    private Scanner scanner;

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    protected void setEnrollmentDate() throws ParseException {
        System.out.print("Please enter enrollment data in the format mm-dd-yyyy: ");
        String userInput = scanner.nextLine();
        enrolmentDate = DATE_FORMAT.parse(userInput);
    }


    protected void infoStudent() {
        System.out.println("Student: " + this.name + " - id: " + this.idStudent);
        System.out.println("Student enrolment date - " + enrolmentDate.toString());
    }

    protected abstract void completedStudy(int year);
}
