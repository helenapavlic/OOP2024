package pckg_vj_7;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class TextApp {
    private static Scanner scanner;
    public static void main(String[] args) {
        String filePath = "VjezbeNaSatu/src/pckg_vj_7/test.txt";
        LinkedList<String> linkedList = AUX_CLS.readDataFromFile(filePath,scanner);
        AUX_CLS.printListElements(linkedList);
        Collections.sort(linkedList);
        System.out.println("-----------------------");
        AUX_CLS.printListElements(linkedList);
    }
}
