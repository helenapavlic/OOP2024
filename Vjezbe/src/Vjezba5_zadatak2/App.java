package Vjezba5_zadatak2;

public class App {
    public static void main(String[] args) {
        Robot rob = new Robot();
        rob.setName("Roby");
        rob.setId(45126);
        Person prs = new Person("Roberta");

        prs.think("Life");
        rob.think("Life");
        prs.walk("North", 50);
        rob.walk("South", 123);
        System.out.println("********** Calculations **************");

        prs.calculate(9);
        rob.calculate(9);
    }
}
