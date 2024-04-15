package pckg_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    private static int value;
    private static String name;
    private static String[] names = new String[5];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

/*
        System.out.println("------------------- lista sa int --------------------");
//        alociranje memorije za 10 elemenata za tip int
//        inicijaliziran sa defaultnim vrijednostima
        int[] ints = new int[10];

//        inicijaliziran array sa elementima
        int[] array = {1,2,3,4,5,6,7,8,9};

        System.out.println("first arr: " + ints.length);
        System.out.println("first arr: " + array.length);

        System.out.println("third element in fst arr: " + ints[3]);
        System.out.println("third element in snd arr: " + array[3]);


        for(int k = 0; k < ints.length; k++){
            ints[k] = k+1;
        }

        System.out.println("third element in fst arr: " + ints[3]);

        System.out.println("------------------ lista sa imenima ------------------------");

//        promjena promjene imena
        names = new String[10];
        changeElement(names,4);
        testiranje liste sa imenima

        populateStringNames(names);
        listElements(names);
*/


        int[] arr1 = {23, 56, 78, 0, -10, 45, 123};
//        kopija prvog niza u punoj duljini -> sada su ova dva niza dva različita objekta sa istim sadržajem
        int[] arr2 = Arrays.copyOf(arr1, arr1.length + 1); // povećava niz, novi obj, može ga i smanjit
        int[] arr3 = Arrays.copyOfRange(arr1, 2, 5);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }

    private static void changeElement(String[] names, int indx) {
//        String[] je složeni tip podataka -> pass by reference
//        nije potrebno imati return jer mijenjaju isti objekt
        if (indx <= names.length - 1) {
            String newName = "Neko novo ime";
            names[indx] = newName;
            System.out.println("Uspješna promjena imena");
        } else {
            System.out.println("index van liste");
        }
    }

    private static void populateStringNames(String[] namesAgain) {
        int cnt = 0;
        while (cnt <= namesAgain.length - 1) {
            System.out.print("Unesi ime: ");
            String name = scanner.nextLine();
            namesAgain[cnt] = name;
            cnt++;
        }
        System.out.println("Added names");
    }

    private static void listElements(String[] names) {
        System.out.println("------------------------");
        for (String name : names) {
            System.out.println("name: " + name);
        }
    }
}
