package pckg_exceptions1;

import java.util.ArrayList;
import java.util.List;

public class TestApp {
    //     unchecked exceptions (run time exceptions) and check exceptions (compile time exception)
    public static void main(String[] args) {
        List<Robot> robots = new ArrayList<>();
        robots.add(new FlyingRobot("robi1"));
        robots.add(new IndustrialRobot("robi2"));
        robots.add(new FlyingRobot("robi3"));
        //exception because there is no StarWarsRobot -> we created it
        robots.add(new StarWarsRobot("robi"));
        System.out.println(robots);
    }
}
