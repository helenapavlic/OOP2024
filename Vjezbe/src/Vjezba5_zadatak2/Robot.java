package Vjezba5_zadatak2;

public class Robot implements CommonAction {
    private static int cnt = 100;
    private String name;
    private int id;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void walk(String direction, int distance) {
        System.out.println("Direction: " + direction + ", distance: " + distance);
    }

    @Override
    public void talk(String s) {
        System.out.println("This robot can't speak :(");

    }

    @Override
    public void think(String s) {
        System.out.println("This robot is thinking about: " + s);
        System.out.println("thinking....");
    }

    @Override
    public void calculate(int i) {
        int res = fakt(i);
        System.out.println(i + "! = " + res);
    }

    private int fakt(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fakt(n - 1);
        }
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public void robotInfo() {
        System.out.println(this);
    }
}
