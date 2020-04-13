package Sorting;

import java.util.Arrays;

// Java code demonstration of selection sort
public class SelectionSort3 {

    public static void main(String[] args) {

        // create object of class to run sorting method on array
        SelectionSort3 object = new SelectionSort3();
        int[] array = new int[]{46, 7, 36, 21, 20, 31, 99};
        System.out.println("unsorted: ");
        printArray(array);
        object.sort(array);
        System.out.println();
        System.out.println("sorted: ");
        printArray(array);

    }

    public void sort(int[] array) {
        int n = array.length;

        // use for loop to iterate through each index of array
        for (int i = 0; i < n - 1; i++) {
            // lowest value index
            int low = i;
            for (int j = i + 1; j < n; j++)
                if (array[j] < array[low])
                    low = j;

            // swapping lowest index with first index
            int temp = array[low];
            array[low] = array[i];
            array[i] = temp;
        }
    }

    // for loop to print array
    public static void printArray(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + " ");
    }

}



