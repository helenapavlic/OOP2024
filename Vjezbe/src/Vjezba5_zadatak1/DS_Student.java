package Vjezba5_zadatak1;

public class DS_Student extends Student {

    public DS_Student(String name) {
        this.name = name;
        this.idStudent = cntStudent++;
    }

    @Override
    protected void completedStudy(int year) {
        if (year < 1) {
            System.out.println("wrong input");
        } else if (year == 1) {
            System.out.println("Student " + name + " is on the first year of the study programme!");
        } else {
            System.out.println("Student " + name + " is on the second year of the study programme!");
            System.out.println("In this year student will complete study by finishing bachelor thesis...");
        }
    }

    @Override
    protected void infoStudent() {
        super.infoStudent();
        System.out.println("Student is on the: " + getClass().getSimpleName() + " - programme!");
    }
}
