package ArraysUtils;

import java.util.Scanner;

public class ArrayUtils {

    /**
     * Lists all elements of the given array.
     *
     * @param items The array whose elements are to be listed.
     * @param <T>   The type of elements in the array.
     */
    public static <T> void listAllElements(T[] items) {
        for (T item : items) {
            System.out.print(item + ", ");
        }
        System.out.println();
    }


    /**
     * Populates the given array with user input values.
     *
     * @param array The array to be populated with values.
     * @param <T>   The type of elements in the array.
     */
    public static <T> void populateArray(T[] array) {
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;
        while (cnt < array.length) {
            System.out.print("Enter a value: ");
            if (array instanceof String[]) {
                // If the array type is String[], read the next line directly
                array[cnt] = (T) scanner.nextLine();
            } else {
                // For other types, read the next token and parse it
                String input = scanner.next();
                if (array instanceof Integer[]) {
                    array[cnt] = (T) Integer.valueOf(input);
                } else if (array instanceof Double[]) {
                    array[cnt] = (T) Double.valueOf(input);
                } // Add additional cases for other types if needed
            }
            cnt++;
        }
        System.out.println("Values added.");
    }

    /**
     * Changes the element at the specified index in the given array with a new value provided by the user.
     *
     * @param array The array in which the element is to be changed.
     * @param index The index of the element to be changed.
     * @param <T>   The type of elements in the array.
     */
    public static <T> void changeElementOnIndex(T[] array, int index) {
        Scanner scanner = new Scanner(System.in);
        if (index >= 0 && index < array.length) {
            System.out.print("Enter a new value: ");
            if (array instanceof String[]) {
                // If the array type is String[], read the next line directly
                array[index] = (T) scanner.nextLine();
            } else {
                // For other types, read the next token and parse it
                String input = scanner.next();
                if (array instanceof Integer[]) {
                    array[index] = (T) Integer.valueOf(input);
                } else if (array instanceof Double[]) {
                    array[index] = (T) Double.valueOf(input);
                } // Add additional cases for other types if needed
            }
            System.out.println("Successful update");
        } else {
            System.out.println("Index out of bounds");
        }
    }
}
