package Sorting;

import java.util.Arrays;

public class BubbleSort1 {

    public static void main(String[] args) {

        // declaring an array
        int[] intArray = new int[]{3, 60, 35, 2, 45, 320, 5};

        // print out array before sorting for comparison
        System.out.println("before sort: " + Arrays.toString(intArray));

        //sorting array elements using bubble sort
        bubbleSort(intArray);

        // print out array after sorting
        System.out.println("after sort: " + Arrays.toString(intArray));
    }

    static void bubbleSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
        // i = 0, 0 < 7, 0 + 1 conditions met, code inside brackets execute
            // i = 1, 1 < 7, 1 + 1 conditions met, code inside brackets execute
            for (int j = 1; j < array.length - 1; j++) {
            // 1, 1 < 7 - 1 = 1 < 6, 1 + 1 conditions met, moves to code inside brackets
                if (array[j - 1] > array[j]) {
                // array[1-1] > array[1] = array[0] > array[1] = 3 > 60, inner loop ends, goes to next outer loop
                    // array[2-1] > array[2] = array[1] > array[2] = 60 > 35, conditions met, code inside brackets execute
                    int temp = array[j - 1];
                    // temp = array[2-1] = array[1] = 60
                    array[j - 1] = array[j];
                    // array[2-1] = array[2], array[1] = array[2], 35 = 35, {3, 35, 35, 2, 45, 320, 5}
                    array[j] = temp;
                    // array[2] = 60, {3, 35, 60, 2, 45, 320, 5}
                }
            }
        }
    }
}
