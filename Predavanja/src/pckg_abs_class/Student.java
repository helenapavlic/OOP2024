package pckg_abs_class;

public class Student extends Person {
    private String university;
    private String studyProgram;

    protected Student(String name, String surname, String university, String studyProgram) {
        super(name, surname);
        this.studyProgram = studyProgram;
        this.university = university;
        System.out.println("constructor called: " + this.getClass().getSimpleName());
    }

    @Override
    protected void getSignature() {
        System.out.println(getClass().getSimpleName() + " name: " + this.name + " surname: " + this.surname + " signed!");
    }

    //    jedan izlaz iz metode!
    public boolean passedExam(String course, int points) {
        boolean passed = false;
        if (points > 50) {
            passed = true;
            System.out.println("passed exam in course: " + course);
        }
        return passed;
    }

    @Override
    public void getInfo() {
//        super.getInfo();
        System.out.println(super.toString());
        System.out.println(this);
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", university='" + university + '\'' +
//                ", studyProgram='" + studyProgram + '\'' +
//                '}';
//    }


    @Override
    public String toString() {
        return "Student{" +
                "university='" + university + '\'' +
                ", studyProgram='" + studyProgram + '\'' +
                '}';
    }
}
