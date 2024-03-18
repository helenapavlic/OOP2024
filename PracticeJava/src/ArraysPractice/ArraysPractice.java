package ArraysPractice;

import java.util.Arrays;

public class ArraysPractice {
/*

    Remove Duplicates:
    Write a program to remove duplicate elements from an array.

    Matrix Operations:
    Implement operations such as matrix addition, subtraction, and multiplication.

    Array Rotation:
    Write a program to rotate the elements of an array to the left or right by a given number of positions.

    Second Largest Element:
    Write a program to find the second largest element in an array.

    Frequency of Elements:
    Write a program to find the frequency of each element in an array.
*/
public static void main(String[] args) {
    int[] intArray = {1200, 45, 87, 109, -12, -45, -511};
    int[] sndIntArray = {4,4,4,4,4,4,4,4,6,-3,25,25,25,67,0,7,7};

    /*
     Sum of Array Elements:
    Write a program to calculate the sum of all elements in an integer array.
*/
    System.out.println("int array: " + Arrays.toString(intArray));
    int sumElements = sumAllArrayElements(intArray);
    System.out.println("sum of integers from array: " + sumElements);


/*
    Find Maximum and Minimum:
    Write a program to find the maximum and minimum elements in an integer array.
*/
    int maxValue = maxValueInArray(intArray);
    System.out.println("max value in array is: " + maxValue);

    int minValue = minValueInArray(intArray);
    System.out.println("min value in array is: " + minValue);

/*
    Reverse an Array:
    Write a program to reverse the elements of an integer array.
    hint: probaj riješiti rekurzivno...
*/
    int[] reversedIntArray = reverseIntArray(intArray);
    System.out.println("original array: " + Arrays.toString(intArray));
    System.out.println("reversed array: " + Arrays.toString(reversedIntArray));


/*
    Sort an Array:
    Write a program to sort an integer array in ascending order. You can implement any sorting algorithm
    like Bubble Sort, Selection Sort, Insertion Sort, or use the Arrays.sort() method.
*/
    System.out.println("original array: " + Arrays.toString(intArray));
    int[] bubbleSortedArray = sortIntegerArrayAscending(intArray);
    System.out.println("array sorted ascending: " + Arrays.toString(bubbleSortedArray));

    System.out.println("original array: " + Arrays.toString(sndIntArray));
    int[] bubbleSortedArray2 = sortIntegerArrayAscending(sndIntArray);
    System.out.println("array sorted ascending: " + Arrays.toString(bubbleSortedArray2));

/*
    Merge Two Arrays:
    Write a program to merge two sorted arrays into a single sorted array.
*/




}

private static int[] mergedIntArrays(int[] sortedArr, int[] sortedArr2){
    int lenOfArr = sortedArr.length + sortedArr2.length;
    int[] fullArray = new int[lenOfArr];


    return null;
}

private static int[] sortIntegerArrayAscending(int[] arr){
    int i, j, temp;
    boolean swapped;
    for (i = 0; i < arr.length - 1; i++) {
        swapped = false;
        for (j = 0; j < arr.length - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                // Swap arr[j] and arr[j+1]
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swapped = true;
            }
        }

        // If no two elements were
        // swapped by inner loop, then break
        if (swapped == false)
            break;
    }
    return arr;
}

private static int[] reverseIntArray(int[] arr){
    int[] reversedArr = new int[arr.length];
    int cnt = 0;
    for (int i = arr.length-1; i >= 0; i--){
        reversedArr[cnt] = arr[i];
        cnt++;
    }
    return reversedArr;
}

private static int sumAllArrayElements(int[] array){
    int sum = 0;
    for (int i : array){
        sum+=i;
    }
    return sum;
}

private static int maxValueInArray(int[] arr){
    int maxInt = arr[0];
    for (int j : arr) {
        if (maxInt < j) {
            maxInt = j;
        }
    }
    return maxInt;
}

private static int minValueInArray(int[] arr){
    int minInt = arr[0];
    for (int j : arr) {
        if (minInt > j) {
            minInt = j;
        }
    }
    return minInt;
}

}
