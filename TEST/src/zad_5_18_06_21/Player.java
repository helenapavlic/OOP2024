package zad_5_18_06_21;

import java.io.Serializable;

public class Player implements Serializable {
    private static int cnt = 1;
    private int id;
    private String name;

    public Player(String name) {
        this.id = cnt++;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
