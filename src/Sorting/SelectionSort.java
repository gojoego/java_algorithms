package Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = new int[]{23,12,3,168,-35,2,45,32,-4};
        System.out.println("unsorted: " + Arrays.toString(array));
        selectionSort(array);
        System.out.println("sorted: " + Arrays.toString(array));

    }

    static void selectionSort(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[minIndex]){
                }
            }
            int minVal = array[minIndex];
            array[minIndex] = array[i];
            array[i] = minVal;
        }
    }

}
