package pckg2;

import java.util.Scanner;
public class MainApp {
    public static void main(String[] args) {
        AUX_CLS.algMenu();
        Scanner scanner = new Scanner(System.in);
        boolean next = true;
        while (next){
            System.out.print("choice (enter 0 for exit): ");
            int choice = scanner.nextInt();
            if (choice != 0){
                System.out.print("num1: ");
                float n1 = scanner.nextFloat();
                System.out.print("num2: ");
                float n2 = scanner.nextFloat();
                AUX_CLS.enterChoice(choice,n1,n2);
            } else {
                next = false;
                System.out.println("exit program");
            }
        }
    }
}
