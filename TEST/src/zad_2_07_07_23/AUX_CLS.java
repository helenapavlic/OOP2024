package zad_2_07_07_23;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class AUX_CLS {

    public static <T> List<String> readDataFromFile(String filePath) throws IOException {
        return Files.readAllLines(Paths.get(filePath));
    }

    public static List<Tvrtka> getCompanyData(List<String> rawData) throws WrongNumberOfFieldsException {
        List<Tvrtka> companies = new ArrayList<>();
        int numberOfFields = Tvrtka.getNumberOfFields(Tvrtka.class);

        for (String line : rawData) {
            String[] fields = line.split(",");

            if (fields.length == numberOfFields) {
                companies.add(new Tvrtka(fields[0].trim(), fields[1].trim(), fields[2].trim(), fields[3].trim()));
            } else {
                throw new WrongNumberOfFieldsException("Wrong number of fields in line: " + line);
            }
        }
        return companies;
    }

    public static void printList(List<Tvrtka> companies) {
        System.out.println("--------------------------------------------------------");
        System.out.println("Listing data:");
        for (Tvrtka company : companies) {
            System.out.println(company);
        }
    }
}

