package zad_1_23_06_23;

public interface Calculate {
    <T extends Number> void addition(T num1, T num2);
    <T extends Number> void subtraction(T num1, T num2);
    <T extends Number> void division(T num1, T num2);
    <T extends Number> void multiplication(T num1, T num2);

}
