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
            for (int j = 1; j < array.length - 1; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
