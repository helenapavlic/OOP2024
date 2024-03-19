package ArraysPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        int[] intArray = {1200, 45, 87, 109, -12, -45, -511};
        int[] sndIntArray = {4, 4, 4, 4, 4, 4, 4, 4, 6, -3, 25, 25, 25, 67, 0, 7, 7};

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
        int[] connectedArrays = mergeIntArrays(bubbleSortedArray, bubbleSortedArray2);
        System.out.println("merged and sorted array: " + Arrays.toString(connectedArrays));

/*
    Remove Duplicates:
    Write a program to remove duplicate elements from an array.
*/
        System.out.println("original array: " + Arrays.toString(sndIntArray));
        ArrayList<Integer> arrayWithoutDuplicates = removeDuplicates(sndIntArray);
        System.out.println("Snd array: without duplicates: " + arrayWithoutDuplicates);


/*
    Frequency of Elements:
    Write a program to find the frequency of each element in an array.
*/
        frequencyOfElements(sndIntArray);


/*
    Second Largest Element:
    Write a program to find the second largest element in an array.
*/
        int sndLargest = sndLargestElement(intArray);
        System.out.println("snd largest in array: " + sndLargest);

        int sndLargest2 = sndLargestElement(sndIntArray);
        System.out.println("snd largest in snd array: " + sndLargest2);


    }

    private static int sndLargestElement(int[] arr) {
        //sortirat listu i izbacit duplikate
        // ako je lista manja od 2 člana onda je prvi član rješenje
        // krenuti sa zadnjeg mjesta i gledati koji je prvi manji od zadnjeg

        int[] sortedList = sortIntegerArrayAscending(arr);
        ArrayList<Integer> withoutDuplicates = removeDuplicates(sortedList);

        int sndLargest;

        if (withoutDuplicates.size() >=2){
            sndLargest = withoutDuplicates.get(withoutDuplicates.size()-2);
        } else {
            sndLargest = withoutDuplicates.get(0);
        }
        return sndLargest;
    }

    private static void frequencyOfElements(int[] array) {
        // uzeti element u temp
        // postaviti cnt na 0
        //provjeriti jesmo li već odradili taj broj
        // proći kroz cijelu listu i povećavati cnt ako se pronađe duplikat
        // ispisati koliko je duplikata tog broja
        // ponoviti postupak


        ArrayList<Integer> checkedElements = new ArrayList<>();
        for (int element : array) {
            int cnt = 0;
            if (!checkedElements.contains(element)) {
                checkedElements.add(element);
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == element) {
                        cnt++;
                    }
                }
                System.out.println(element + ": " + cnt + " ponavljanja u nizu.");
            }
        }
    }


    private static ArrayList<Integer> removeDuplicates(int[] array) {
        int[] arrayWithoutDuplicates = new int[10];
        int temp;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            temp = array[i];
            if (!arr.contains(temp)) {
                arr.add(temp);
            }
        }
        return arr;
    }

    private static int[] mergeIntArrays(int[] sortedArr, int[] sortedArr2) {
        int lenOfArr = sortedArr.length + sortedArr2.length;
        int[] fullArray = new int[lenOfArr];
        int position = 0;
        for (int element : sortedArr) {
            fullArray[position] = element;
            position++;
        }
        for (int element : sortedArr2) {
            fullArray[position] = element;
            position++;
        }
        return sortIntegerArrayAscending(fullArray);
    }

    private static int[] sortIntegerArrayAscending(int[] arr) {
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
            if (!swapped)
                break;
        }
        return arr;
    }

    private static int[] reverseIntArray(int[] arr) {
        int[] reversedArr = new int[arr.length];
        int cnt = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reversedArr[cnt] = arr[i];
            cnt++;
        }
        return reversedArr;
    }

    private static int sumAllArrayElements(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    private static int maxValueInArray(int[] arr) {
        int maxInt = arr[0];
        for (int j : arr) {
            if (maxInt < j) {
                maxInt = j;
            }
        }
        return maxInt;
    }

    private static int minValueInArray(int[] arr) {
        int minInt = arr[0];
        for (int j : arr) {
            if (minInt > j) {
                minInt = j;
            }
        }
        return minInt;
    }

}
