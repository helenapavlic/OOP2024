package zad_3_07_07_23;

import zad_4_23_06_23_serijalizacija.AUX_CLS;

import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game implements Serializable {
    private static final int DEFINED_NUMBERS = 5;
    private static final int LOWER_BOUND = 0;
    private static final int UPPER_BOUND = 39;
    private static final String ROOT_PATH = "TEST\\Games\\";
    private static final String EXTENSION = ".bin";

    private Player player;
    private String filePath;
    private int gamePlayed;
    private List<Integer> gameScores;
    private List<Game> games; //bio playerdData

    public Game(Player player) {
        this.player = player;
        if (!fileAlreadyExist(player.getUserName())){
            gamePlayed = 0;
            gameScores = new ArrayList<>();
            games = new ArrayList<>();
        } else {
            getGameData();
        }
        filePath = ROOT_PATH + player.userName + EXTENSION;
    }

    private static boolean fileAlreadyExist(String playerUserName) {
//        provjera postoji li datoteka
        boolean doesExist = false;
        Path path = Path.of(ROOT_PATH, playerUserName + EXTENSION);
        if (Files.exists(path)) {
            return true;
        }
        return doesExist;
    }

    private static Integer[] numToGuess() {
        Integer[] numbersToGuess = new Integer[DEFINED_NUMBERS];
        ArrayList<Integer> numbersAlreadyInList = new ArrayList<>();

        for (int i = 0; i < DEFINED_NUMBERS; i++) {
            boolean addedNum = false;
            do {
                int num = ThreadLocalRandom.current().nextInt(LOWER_BOUND, UPPER_BOUND + 1);
                if (!numbersAlreadyInList.contains(num)) {
                    numbersAlreadyInList.add(num);
                    numbersToGuess[i] = num;
                    addedNum = true;
                }
            } while (!addedNum);
        }

        System.out.println("Combination successfully generated!");
        return numbersToGuess;
    }

    private static Integer[] userCombination(Scanner scanner) {
        Integer[] userCombination = new Integer[DEFINED_NUMBERS];
        ArrayList<Integer> numbersAlreadyInList = new ArrayList<>();

        for (int i = 0; i < DEFINED_NUMBERS; i++) {
            boolean addedNum = false;
            do {
                System.out.print("Enter number " + (i + 1) + ": ");
                String input = scanner.nextLine();

                try {
                    int num = Integer.parseInt(input);

                    if (!numbersAlreadyInList.contains(num) && (num >= LOWER_BOUND && num <= UPPER_BOUND)) {
                        numbersAlreadyInList.add(num);
                        userCombination[i] = num;
                        addedNum = true;
                        System.out.println("Added new number: " + num);
                    } else if (!(num >= LOWER_BOUND && num <= UPPER_BOUND)) {
                        System.out.println("Number is not between " + LOWER_BOUND + " and " + UPPER_BOUND);
                    } else {
                        System.out.println("Number is already in your combination!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a number between " + LOWER_BOUND + " and " + UPPER_BOUND);
                }
            } while (!addedNum);
        }
        return userCombination;
    }

    public void printPlayerGameData() {
        for (Game game : games) {
            System.out.println(game);
            System.out.println("-------------------------------------");
        }
    }


    public void playGame(Scanner scanner) {
//        Game game = new Game(player);

        boolean play = true;
        while (play) {
//            if (fileAlreadyExist(player.getUserName())) {
//                getGameData();
//            }
            gamePlayed++;
            System.out.println("games played: " + gamePlayed);
            System.out.println("Generating new combination...");
            Integer[] numbersToGuess = Game.numToGuess();
            System.out.println(Arrays.toString(numbersToGuess));

            System.out.println("Enter your combination: ");
            Integer[] userCombination = userCombination(scanner);

            int guessed = getScore(numbersToGuess, userCombination);
            System.out.println("guess score: " + guessed);
            gameScores.add(guessed);
            System.out.println(gameScores);

            System.out.println("Do you want to play again? y for yes");
            String continueToPlay = scanner.nextLine();
            if (!continueToPlay.equalsIgnoreCase("y")) {
                play = false;
                games.add(this);
                saveData();
            }
        }
    }

    private int getScore(Integer[] generatedNumbers, Integer[] guessedNumbers) {
        int correct = 0;
        ArrayList<Integer> intersection = new ArrayList<>();
        for (Integer generatedNumber : generatedNumbers) {
            for (Integer guessedNumber : guessedNumbers) {
                if (generatedNumber.equals(guessedNumber)) {
                    correct++;
                    intersection.add(generatedNumber);
                }
            }
        }
        System.out.println("Combination to guess: " + Arrays.toString(generatedNumbers));
        System.out.println("Your combination is: " + Arrays.toString(guessedNumbers));
        System.out.println(intersection);
        return correct;
    }


    public void getGameData() {

        Game game = AUX_CLS.readObjectFromFile(filePath);
        games = game.getGames();
        System.out.println(games);


    }


    public List<Game> getGames() {
        return games;
    }

    private void saveData() {
        AUX_CLS.addObjectToFile(filePath,this);
    }

    @Override
    public String toString() {
        return "Game{" +
                "gamePlayed=" + gamePlayed +
                ", gameScores=" + gameScores +
                ", games=" + games +
                '}';
    }
}

