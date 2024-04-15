package pckg2;

public class AUX_CLS {
    public static void algMenu() {
        System.out.println("********************************************");
        System.out.println("1: addition");
        System.out.println("2: subtraction");
        System.out.println("3: multiplication");
        System.out.println("4: division");
        System.out.println("********************************************");
    }

    public static void enterChoice(int choice, float n1, float n2) {
        float res;
        switch (choice) {
            case 1: {
                res = MainAlgOperations.addition(n1, n2);
                System.out.println("res: " + res);
            }
            break;
            case 2: {
                res = MainAlgOperations.subtraction(n1, n2);
                System.out.println("res: " + res);
            }
            break;
            case 3: {
                res = MainAlgOperations.multiplication(n1, n2);
                System.out.println("res: " + res);
            }
            break;
            case 4: {
                res = MainAlgOperations.division(n1, n2);
                System.out.println("res: " + res);
            }
            break;
            default:
                System.out.println("invalid input");
        }
    }
}

