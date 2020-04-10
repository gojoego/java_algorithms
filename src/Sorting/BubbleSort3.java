package Sorting;

import java.util.Arrays;

public class BubbleSort3 {

    public static void main(String[] args) {

        int[] arr = new int[]{23, 12, 1, -4, 400, 55, -22, 168};

        System.out.println("unsorted: " + Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("unsorted: " + Arrays.toString(arr));

    }

    private static void bubbleSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            for (int j = 1; j < arr.length - 1; j++) {

                if (arr[j = 1] > arr[j]) {
                    int t = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }
}
