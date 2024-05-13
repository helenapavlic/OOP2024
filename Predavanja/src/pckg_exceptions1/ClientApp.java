package pckg_exceptions1;

import java.io.FileNotFoundException;
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
        String filepath = "Predavanja/src/pckg_exceptions1/primjer.txt";
//        hendling scanner exception from readFromFileMethod
        try {
            ReadContentClass.readFromFile(filepath);
        } catch (FileNotFoundException e) {
            System.out.println("error");
        }
    }
}
