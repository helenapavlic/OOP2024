package zad_1_23_06_23;

public class AUX_CLS{

    public static <T extends Number> void addition(T num1, T num2) {
        System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, num1.doubleValue()+num2.doubleValue());

    }

    public static <T extends Number> void subtraction(T num1, T num2) {
        System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, num1.doubleValue()-num2.doubleValue());
    }

    public static <T extends Number> void division(T num1, T num2) {
        if (num1.doubleValue()== 0 || num2.doubleValue()==0){
            System.out.println(num1 + " / " + num2 + " = ZERO DIVISION");
        } else {
//            System.out.println(num1 + " / " + num2 + " = " + num1.doubleValue()/num2.doubleValue());
            System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, num1.doubleValue()/num2.doubleValue());
        }
    }

    public static <T extends Number> void multiplication(T num1, T num2) {
        System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, num1.doubleValue()*num2.doubleValue());
    }

    public static boolean isNumeric(String input){
        boolean isNum = false;
        try{
            Double.parseDouble(input);
            isNum = true;

        } catch (NumberFormatException nfe){
            isNum = false;
        }
        return isNum;
    }

    public static void concat(String str1, String str2){
        System.out.println(str1 + str2);
    }
}
