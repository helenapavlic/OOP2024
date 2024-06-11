package zad_3_07_07_23;

import java.io.Serial;
import java.io.Serializable;

public class LuckyGamePlayer extends Player implements Serializable{
    public LuckyGamePlayer(String userName, String dateOfBirth) {
        super(userName, dateOfBirth);
    }

    @Override
    protected void playGamesSince() {

    }

    @Override
    public String toString() {
        return "LuckyGamePlayer{" +
                "userName='" + userName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
