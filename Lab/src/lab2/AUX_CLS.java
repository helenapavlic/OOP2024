package lab2;

import java.util.Scanner;

public class AUX_CLS {

    public static java.lang.String[] genStringArr(int arraySize) {
        String[] array = new String[arraySize];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arraySize; i++) {
            System.out.print("input string for position " + i + ": ");
            String input = sc.nextLine();
            array[i] = input;
        }
        return array;
    }

    public static void listArrayElements(java.lang.String[] stringArr) {
        for (String element : stringArr) {
            System.out.println(element);
        }
    }

    public static void listArrayElementsAndIndexPos(java.lang.String[] stringArr) {
        for (int i = 0; i < stringArr.length; i++) {
            System.out.println(i + " -> " + stringArr[i]);
        }

    }
}
