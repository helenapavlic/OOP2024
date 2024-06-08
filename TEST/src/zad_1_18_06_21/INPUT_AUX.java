package zad_1_18_06_21;

import java.util.Arrays;
import java.util.Scanner;

public class INPUT_AUX {

//     Provjerava je li uneseni string sastavljen isključivo od slova.
    public static boolean checkInput(String input){
        boolean flag = true;
        for (int i = 0; i< input.length(); i++){
            if (!Character.isLetter(input.charAt(i))){
                flag = false;
            }
        }
        if (!flag){
            System.out.println("Unexpected input!");
        }
        return flag;
    }

//    provjerava naliazi li se string u listi

    public static void inList(String rijec){
        boolean inList = false;
        String[] lista = {"Ovo", "je", "primjer", "liste", "stringova"};
        for (String element : lista) {
            if (element.equals(rijec.strip().toLowerCase())){
                System.out.println(Arrays.toString(lista));
                System.out.println(rijec + " je u listi!");
                inList = true;
            }
        }
        if (!inList){
            System.out.println(rijec + " nije u listi");
        }
    }

//    omogucuje unos korisnika dok korisnik ne zatrazi prekid unosa
//    provjerava unos i ispisuje je li upisana rijec u listi
    public static void moreInputs(){
        Scanner sc = new Scanner(System.in);

        //unos
        System.out.println("Enter one word...");
        String unos = sc.nextLine();

        //provjera je li str
        boolean isStr = checkInput(unos);

        //provjera je li u listi
        if (isStr){
            inList(unos);
        }

        System.out.println("Finnish - 1 yes - other continue... ");
        unos = sc.nextLine();
        if (!unos.equals("1")){
            System.out.println("next round...");
            moreInputs();
            System.out.println();
        } else {
            System.out.println("finnished!!");
        }
        sc.close();
    }
}

