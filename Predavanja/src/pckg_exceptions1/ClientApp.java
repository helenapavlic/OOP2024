package pckg_exceptions1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClientApp {
    //    exception handling -> try catch ili throws in method signature -> exception propagation
//    nacin koji odabiremo ovisi gdje je logicnije rjesavati odredeni exception, razlikuje se u praksi
    public static void main(String[] args) {
//        try{
//            Scanner sc = new Scanner(System.in);
//            double number;
//            System.out.print("please enter one number (double): ");
//            number = sc.nextDouble();
//            System.out.println("you have entered: " + number);
//        } catch (InputMismatchException ime){
//            System.out.println("inout is not double");
//        }

//        copy od repository root
//        String filepath = "Predavanja/src/pckg_exceptions1/primjer.txt";
////        hendling scanner exception from readFromFileMethod
//        try {
//            ReadContentClass.readFromFile(filepath);
//        } catch (FileNotFoundException e) {
//            System.out.println("error");
//        }

        userAge();
    }

//    finally blok -> uvijek se izcršava
//    finally sluzi na neki oporavak, npr nova mogucnost unosa od korisnika
//    mozemo imati vise catch blokova -> moramo paziti na redoslijed exceptiona
//    npr. ako je catch Exception prije detaljnjijeg exceptiona on ce se izvrsiti i kad imamo konkretniji exception

    private static void userAge() {
        Scanner scanner = new Scanner(System.in);
        int userDefineAge;
        boolean proceedInput = true;
        while (proceedInput) {
            try {
                System.out.print("input user age: ");
                userDefineAge = scanner.nextInt();
                if (userDefineAge < 0) {
                    throw new Exception("negative value for age is not allowed!");
                }
                System.out.println("user defined age: " + userDefineAge);
            } catch (InputMismatchException ime) {
//            clears scanner
                scanner.next();
                System.out.println("Wrong Input, we need int value");
            } catch (Exception nve) {
                System.out.println(nve.getMessage());
            } finally {
                System.out.print("Enter any number to proceed - other for exit ");
                if (scanner.hasNextInt()) {
                    int cont = scanner.nextInt();
                    System.out.println("you choose to proceed...");
                } else {
                    proceedInput = false;
                    scanner.close();
                    System.out.println("you choose to exit");
                }
            }
        }

    }
}
