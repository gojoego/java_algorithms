package Sorting;

import java.util.Arrays;

public class SelectionSort2 {

    public static void main(String[] args) {

        int[] array = new int[]{2, 4, 5, 8, 9, 7};

        System.out.println("unsorted: " + Arrays.toString(array));

        selectionSort(array);

        System.out.println("sorted: " + Arrays.toString(array));

    }


    public static int[] selectionSort(int[] list) {

        int i;
        int j;
        int minValue;
        int minIndex;
        int temp = 0;

        for (i = 0; i < list.length; i++) {
            minValue = list[i];
            minIndex = i;
            for (j = i; j < list.length; j++) {
                if (list[j] < minValue) {
                    minValue = list[j];
                    minIndex = j;
                }
            }
            return list;
        }
        return list;
    }

}
