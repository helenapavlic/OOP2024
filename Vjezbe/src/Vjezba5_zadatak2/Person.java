package Vjezba5_zadatak2;

public class Person implements CommonAction {
    private static int cnt = 100;
    private String name;
    private int id;

    public Person(String name) {
        this.name = name;
        this.id = cnt++;
    }


    @Override
    public void walk(String direction, int distance) {
        System.out.println("Person is walking to " + direction + ", for " + distance + " meters");

    }

    @Override
    public void talk(String s) {
        System.out.println(s);

    }

    @Override
    public void think(String s) {
        System.out.println("this person is thinking about " + s);

    }

    @Override
    public void calculate(int i) {
        int res = 1;
        while (i > 0) {
            res *= i;
            i--;
        }
        System.out.println("res: " + res);

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public void personInfo() {
        System.out.println(this);
    }
}
