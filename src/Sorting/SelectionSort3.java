package Sorting;

import java.util.Arrays;

// Java code demonstration of selection sort
public class SelectionSort3 {

    public static void main(String[] args) {

        SelectionSort3 ob = new SelectionSort3();
        int[] array = new int[]{46, 7, 36, 21, 20, 31, 99};
        System.out.println("unsorted: " + Arrays.toString(array));
        ob.sort(array);
        System.out.println("sorted: " + Arrays.toString(array));

    }


    public void sort(int[] array) {
        int n = array.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (array[j] < array[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

    // Prints the array
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}



