package pckg2;

public class MainAlgOperations {

    public static float addition(float num1, float num2) {
        float result = num1 + num2;
        System.out.println("Addition result: " + result);
        return result;
    }

    public static float subtraction(float num1, float num2) {
        float res = num1 - num2;
        System.out.println("Subtraction result: " + res);
        return res;
    }

    public static float multiplication(float n1, float n2) {
        float res = n1 * n2;
        System.out.println("Result of multiplication: " + res);
        return res;
    }

    public static float division(float n1, float n2) {
        float res = 0f;
        if (n2 != 0) {
            res = n1 / n2;
            System.out.println("division result is: " + res);
        } else {
            System.out.println("division by 0!");
        }
        return res;
    }
}
