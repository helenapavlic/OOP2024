package ArraysUtils;

public class TestArraysUtils {
    public static void main(String[] args) {
// Test listAllElements method
        System.out.println("Testing listAllElements method:");
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Integer Array:");
        ArrayUtils.listAllElements(intArray);

        String[] stringArray = {"Apple", "Banana", "Orange", "Grapes", "Mango"};
        System.out.println("String Array:");
        ArrayUtils.listAllElements(stringArray);

        System.out.println("----------------------------");

        // Test populateArray method
        System.out.println("\nTesting populateArray method:");
        Integer[] populatedIntArray = new Integer[3];
        System.out.println("Integer Array before population:");
        ArrayUtils.listAllElements(populatedIntArray);
        ArrayUtils.populateArray(populatedIntArray);
        System.out.println("Integer Array after population:");
        ArrayUtils.listAllElements(populatedIntArray);

        String[] populatedStringArray = new String[3];
        System.out.println("String Array before population:");
        ArrayUtils.listAllElements(populatedStringArray);
        ArrayUtils.populateArray(populatedStringArray);
        System.out.println("String Array after population:");
        ArrayUtils.listAllElements(populatedStringArray);

        System.out.println("----------------------------");

        // Test changeElementOnIndex method
        System.out.println("\nTesting changeElementOnIndex method:");
        System.out.println("String Array before change:");
        ArrayUtils.listAllElements(stringArray);
        ArrayUtils.changeElementOnIndex(stringArray, 2);
        System.out.println("String Array after change:");
        ArrayUtils.listAllElements(stringArray);

        System.out.println("Integer Array before change:");
        ArrayUtils.listAllElements(intArray);
        ArrayUtils.changeElementOnIndex(intArray, 3);
        System.out.println("Integer Array after change:");
        ArrayUtils.listAllElements(intArray);

        System.out.println("----------------------------");
    }
}
