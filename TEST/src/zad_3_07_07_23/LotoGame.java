package zad_3_07_07_23;

import zad_4_23_06_23_serijalizacija.AUX_CLS;

import java.io.Serializable;
import java.util.Scanner;

public class LotoGame {
    public static void main(String[] args) {

        Player player = new LuckyGamePlayer("helenaa","4.4.2001.");
        Game game = new Game(player);
        System.out.println(player);
        game.playGame(new Scanner(System.in));
        AUX_CLS.addObjectToFile("TEST\\Games\\elencihh.bin",game);
        Game game1 = AUX_CLS.readObjectFromFile("TEST\\Games\\elencihh.bin");
        System.out.println(game1);
    }


}
