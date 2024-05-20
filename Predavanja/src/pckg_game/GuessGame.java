package pckg_game;


import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessGame {

//    Korisnik unosi pretpostavljenu vrijednost godina, ali i gornju i
//donju granicu godina kojima definira interval za daljnje
//pogađanje u slučaju netočnog odgovora

    private Scanner scanner = new Scanner(System.in);
    private int userGuess;
    private int counter;
    private boolean proceedInput;
    private int ageToGuess;
    private int lowerBound;
    private int upperBound;

    public GuessGame() {
        ageToGuess = AUXCLS.generateRandom();
        proceedInput = true;
        counter = 1;
        System.out.println(ageToGuess);
    }


    public void play() {
        System.out.println("Welcome to guess age game!! ");
        while (proceedInput) {

            try {
                //trazi unos broja za pogadanje
                //provjeri je li pogoden broj
                // ako je ispisi u koliko pokusaja je pogoden broj
                // ako nije trazi donju i gornju granicu
                // provjeri je li broj unutar te granice
                // ispisi odgovarajucu poruku je li ili nije unutar te granice

                System.out.print("input guess age: ");
                userGuess = scanner.nextInt(); 


                if (userGuess < 0) {
                    throw new Exception("negative value for age is not allowed!");
                } else if (userGuess != ageToGuess){
                    counter++;
                    System.out.println("input upper bound: ");
                    try {
                        upperBound = scanner.nextInt();
                    } catch (GameInputException gie){
                        System.out.println(gie.getMessage());
                    }


                } else {
                    System.out.println("congrats you guessed the age: " + ageToGuess);
                    System.out.println("counter: " + counter);
                }


            } catch (GameInputException gie) {
                System.out.println(gie.getMessage());
//            clears scanner
                scanner.next();
            } catch (Exception nve) {
                System.out.println(nve.getMessage());
            } finally {
                System.out.print("Do you want to try again? Int for yes, anything else for exit... ");
                if (scanner.hasNextInt()) {
                    scanner.nextInt();
                } else {
                    proceedInput = false;
                    scanner.close();
                    System.out.println("you tried to guess age " + counter + " times");
                    System.out.println("generated age to guess was: " + ageToGuess);
                    System.out.println("Bye");
                }
            }
        }
    }


}
