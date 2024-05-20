package pckg_game;

import java.util.concurrent.ThreadLocalRandom;

public class AUXCLS {
    public static int generateRandom(){
        return ThreadLocalRandom.current().nextInt(100);
    }

    public static boolean isInteger(String input){
        try{
            Integer.parseInt(input);
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
