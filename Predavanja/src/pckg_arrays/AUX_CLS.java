package pckg_arrays;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class AUX_CLS {
    private static final int MINI = 10;
    private static final int MAXI = 100;
    private static Scanner scanner = new Scanner(System.in);

//    metoda koja puni int niz, mi zadamo veličinu niza
    public static int[] populateIntArray(int arrLen){
        int[] resultArr = new int[arrLen];
        for (int i = 0; i < arrLen; i++) {
            int randomNumber = ThreadLocalRandom.current().nextInt(MINI, MAXI);
            resultArr[i] = randomNumber;
        }
        return resultArr;
    }

//    metoda koja izlistava sve elemente int niza
    public static void printIntArray(int[] arrayToPrint){
        for (int num : arrayToPrint){
            System.out.print(num + ", ");
        }
        System.out.println();
    }

//   metoda koja puni int niz korisničkim unosom
    public static int[] populateArrayWithInput(int arrayLen){
        int[] arr = new int[arrayLen];
        for (int i = 0; i < arrayLen; i++) {
            int num = getIntFromStandardInout();
            arr[i] = num;
        }
        return arr;
    }

//    privatna metoda koja provjerava je li unesen int
    private static int getIntFromStandardInout(){
        int num = 0;
        boolean isInt = false;
        while (!isInt) {
            try{
                System.out.print("please enter int: ");
                num = scanner.nextInt();
                isInt = true;
            }catch (InputMismatchException ime){
                System.out.println("invalid input, please provide int");
                scanner.nextLine();
            }
        }
        return  num;
    }

//    program koji kreira string iz String[] niza na 3 načina:
    public static String connectStringFromArray(String[] arr){
        return String.join(" ",arr);
    }

    public static String linkUsingStringBuilder(String[] arr){
        StringBuilder sb = new StringBuilder();
        for (String element : arr){
            sb.append(element);
            sb.append(" ");
        }
        return sb.toString();
    }

    public static String connectArrayElements(String[] strArr){
        String con = "";
        for (String element : strArr){
            con = con + element + " ";
        }
        return con;
    }

//    kraj zadatka

//    2d int[] arrays
//    metoda koja puni 2d niz
    public static int[][] generate2DArray(int rows, int cols){
        int[][] arr2D = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++){
                arr2D[i][j] = ThreadLocalRandom.current().nextInt(MINI,MAXI);
            }
        }
        return arr2D;
    }

//    metoda koja printa 2d int niz
    public static void print2Darr(int[][] arrayToPrint){
        for (int[] row: arrayToPrint){
            for (int num : row){
                System.out.print(num + ", ");
            }
            System.out.println();
        }
    }

}
