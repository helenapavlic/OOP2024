package pckg_serializable;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class SpaceShip implements Serializable, EqualSpaceShips {

    private static final int START_YEAR = 2000;
    private static final int MINI = 1;
    private static final int MAXI = 1000;
    private static int cntId = 10;
    private String name;
    private int id;
    private LocalDate firstMissionDate;
    private int numMissions;


    public SpaceShip(String name) {
        this.name = name;
        this.id = cntId++;
        this.firstMissionDate = generateFirstMissionDate();
        this.numMissions = generateNumbMissions();
    }

    private LocalDate generateFirstMissionDate() {

        LocalDate startDate = LocalDate.of(START_YEAR, 1, 1);
        LocalDate endDate = LocalDate.now();
        long start = startDate.toEpochDay();
        long end = endDate.toEpochDay();

        long random = ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();
        return LocalDate.ofEpochDay(random);
    }

    private int generateNumbMissions() {
        return ThreadLocalRandom.current().nextInt(MINI, MAXI);
    }

    @Override
    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", firstMissionDate=" + firstMissionDate +
                ", numMissions=" + numMissions +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

//    bilo bi idealno da je ova metoda statička

    @Override
    public boolean equalSpaceShips(SpaceShip thisSpaceShip, SpaceShip otherSpaceShip) {
        return thisSpaceShip.getId() == otherSpaceShip.getId() && Objects.equals(thisSpaceShip.getName(), otherSpaceShip.getName());
    }
}
