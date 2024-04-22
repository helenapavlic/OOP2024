package lab2;

public class Test {


    public static void main(String[] args) {

        // generate array of five strings

        String[] strings = AUX_CLS.genStringArr(5);

        // list all elements
        AUX_CLS.listArrayElements(strings);

        // Do not change this line

        System.out.println("--------------------------------------------");

        // list all elements and index positions
        AUX_CLS.listArrayElementsAndIndexPos(strings);


    }

}
