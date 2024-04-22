package Vjezba5_zadatak1;

public class DS_Student extends Student {

    public DS_Student(String name) {
        this.name = name;
        this.idStudent = cntStudent++;
    }

    @Override
    protected void completedStudy(int year) {
        if (year < 2) {
            System.out.println(name + " student nije završio studij.");
        } else {
            System.out.println(name + " student je završio studij.");
        }
    }

    @Override
    protected void infoStudent() {
        super.infoStudent();
        System.out.println("Student je na diplomskom studiju.");
    }
}
