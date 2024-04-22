package Vjezba5_zadatak1;

public class PDS_Student extends Student {

    public PDS_Student(String name) {
        this.name = name;
        this.idStudent = cntStudent++;
    }

    @Override
    protected void completedStudy(int year) {
        if (year < 3) {
            System.out.println(name + " student nije završio studij.");
        } else {
            System.out.println(name + " student je završio studij.");
        }
    }

    @Override
    protected void infoStudent() {
        super.infoStudent();
        System.out.println("Student je na preddiplomskom studiju.");
    }
}
