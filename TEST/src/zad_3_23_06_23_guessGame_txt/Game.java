package zad_3_23_06_23_guessGame_txt;

import java.util.HashMap;
import java.util.Scanner;

public class Game {
    private static HashMap<Integer, Player> createdPlayers = new HashMap<>();
    GuessGame guessGame;
    Player player;
    Scanner scanner;
    private boolean play;
    private String filePath = "TEST/src/zad_3_23_06_23_guessGame_txt/players.txt";

    public Game() {
        scanner = new Scanner(System.in);
    }

    public void startGame(Player player) {
        this.player = player;
        if (!createdPlayers.containsKey(player.getId())) {
            createdPlayers.put(player.getId(), player);
//            System.out.println("added new player: " + player);
        }
        int gamesPlayed = player.getGamesPlayed() +1;
        player.setGamesPlayed(gamesPlayed);
        System.out.println("---------- IGRAČ: " + String.format("%-10.10s", player.getName()) + " ----------");
        play = true;
        int guessed = player.getGuessed();
        int missed = player.getMissed();

        while (play) {
            GuessGame guessGame = new GuessGame();
            String city = guessGame.randomPickCity();
            System.out.println(city);

            guessGame.printToGuess(city);
            System.out.println("Probajte pogoditi ime grada...");
            String playerGuess = scanner.nextLine();

            if (guessGame.checkGuess(playerGuess)) {
                System.out.println("POGODAK -> unos " + playerGuess + " jednak je traženom unosu!");
                guessed++;
                player.setGuessed(guessed);
                proceedToPlay();
            } else {
                System.out.println("Niste pogodili");
                missed++;
                player.setMissed(missed);
                proceedToPlay();
            }
        }
    }

    public void proceedToPlay() {
        System.out.println();
        System.out.println("Za nastavak 'y' - bilo koji drugi za izlaz ");
        String response = scanner.nextLine();
        if (!response.equalsIgnoreCase("y")) {
            System.out.println();
            System.out.println("Odabrali ste izlaz iz igre. Vaš je rezultat spremljen");
            play = false;
            createdPlayers.replace(player.getId(), player);
            System.out.println(player.getGuessed() + " pogodak + " + player.getMissed() + " promasaj.");

            System.out.println("--------------------- txt file ------------------");
            AUX_CLS.saveAnotherToTxtFile(player.toString(),filePath);
            AUX_CLS.readAndPrintTxtFile(filePath);
            System.out.println("----------------------------------------");
        } else {
            System.out.println();
            System.out.println("Bio je ovo " + (player.getGuessed() + player.getMissed()) + " pokusaj - nastavljamo dalje");
//            System.out.println("tocno: " + player.getGuessed());
//            System.out.println("netocno: " + player.getMissed());
        }
    }

}
