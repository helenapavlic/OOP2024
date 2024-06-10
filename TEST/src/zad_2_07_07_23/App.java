package zad_2_07_07_23;

import java.io.IOException;
import java.util.List;

public class App {
    public static void main(String[] args) {

        String filePath = "TEST/src/zad_2_07_07_23/podaci-tvrtke.txt";

        try {
            // Step 1: Read RAW data from file
            System.out.println("Reading data from file and creating RAW data structure.");
            List<String> rawData = AUX_CLS.readDataFromFile(filePath);

            // Step 2: Transform RAW data into Tvrtka objects
            System.out.println("Transforming data to the structure of Tvrtka objects.");
            List<Tvrtka> companies = AUX_CLS.getCompanyData(rawData);

            // Step 3: Print the list of Tvrtka objects
            AUX_CLS.printList(companies);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (WrongNumberOfFieldsException e) {
            throw new RuntimeException(e);
        }
    }
}

