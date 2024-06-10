package pckg_exceptions1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadContentClass {

//    TEXT DATOTEKA

    public static void readFromFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
//        try {
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            System.out.println("Line: " + line);
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("error");
//        }
        }
    }
}
