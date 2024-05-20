package pckg_game;

import java.util.InputMismatchException;

public class GameInputException extends InputMismatchException {
    public GameInputException(String message){
        super(message);
    }
}
