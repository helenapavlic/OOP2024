package zad_2_18_06_21;

import java.util.Random;

public class RandomDirection {
    private static final String[] DIRECTIONS = {"North", "West", "East", "South"};
    private static final double MIN = 1;
    private static final double MAX = 100;

    private static final Random random = new Random();

    private static double speed;
    private static String direction;

    public RandomDirection() {
        genRandDirectionData();
    }

    private void genRandDirectionData(){
        //rand speed
        speed = random.nextDouble(MIN,MAX);
        //rand dir
        int dirInt = random.nextInt(DIRECTIONS.length);
        //System.out.println("intDir: " + dirInt);
        direction = DIRECTIONS[dirInt];
    }

    public double getSpeed() {
        return speed;
    }

    public String getDirection() {
        return direction;
    }




}
