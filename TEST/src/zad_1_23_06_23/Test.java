package zad_1_23_06_23;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        boolean continueInput = true;
        Scanner scanner = new Scanner(System.in);



        while (continueInput){
            System.out.print("please enter string or number: ");
            String input1 = scanner.nextLine();

            System.out.print("please enter string or number: ");
            String input2 = scanner.nextLine();

            if (AUX_CLS.isNumeric(input1) && AUX_CLS.isNumeric(input2)){
                double num1 = Double.parseDouble(input1);
                double num2 = Double.parseDouble(input2);
                AUX_CLS.addition(num1,num2);
                AUX_CLS.subtraction(num1,num2);
                AUX_CLS.division(num1,num2);
                AUX_CLS.multiplication(num1,num2);
            } else {
                AUX_CLS.concat(input1,input2);
            }
            System.out.println("-----------------------------------------");
            System.out.println();

            System.out.print("to exit enter 'x' - any other to continue: ");
            String nextInput = scanner.nextLine();
            System.out.println();

            if (nextInput.equalsIgnoreCase("x")){
                continueInput=false;
                System.out.println("User desides to quit app!");
            }

        }








    }
}
