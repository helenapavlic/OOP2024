package pckg_vj_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class AUX_CLS {
    //    pozeljno je imati jedan scanner u mainu i on se porsljeduje dalje
    public static LinkedList<String> readDataFromFile(String path, Scanner scanner) {
        LinkedList<String> list = new LinkedList<>();
        File file = new File(path);
        try {
            scanner = new Scanner(file);
            String line;
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                list.add(line);
            }
        } catch (FileNotFoundException fne) {
            System.out.println("file not found");
        }

        System.out.println(list);
        return list;
    }

    public static <E> void printListElements(LinkedList<E> list) {
        for (E element : list) {
            System.out.println(element);
        }
    }
}
