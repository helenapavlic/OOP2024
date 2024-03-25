package pckg_arrays;

import java.util.Arrays;

public class TestArr {

    public static void main(String[] args) {
        int[] arr = AUX_CLS.populateIntArray(5);
        System.out.println(Arrays.toString(arr));

        AUX_CLS.printIntArray(arr);

        int[] newArrFromUser = AUX_CLS.populateArrayWithInput(3);
        AUX_CLS.printIntArray(newArrFromUser);

        String[] strArray = {"Vasa", "vana plurium" , "sonant"};
        String rez = AUX_CLS.connectStringFromArray(strArray);
        System.out.println(rez);

        String rez1 = AUX_CLS.linkUsingStringBuilder(strArray);
        System.out.println(rez1);

        String rez2 = AUX_CLS.connectArrayElements(strArray);
        System.out.println(rez2);

        int[][] arr2D = AUX_CLS.generate2DArray(4,5);
        //System.out.println(Arrays.deepToString(arr2D));
        AUX_CLS.print2Darr(arr2D);

    }
}
