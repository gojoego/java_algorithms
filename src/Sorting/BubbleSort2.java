package Sorting;

import java.util.Arrays;

public class BubbleSort2 {

    public static void bubbleSort (int[] array){
        boolean isSorted = false;
        int lastUnsorted = array.length - 1;
        while (!isSorted) {
            isSorted = true;
            // using array.length -1, will get out of bounds error otherwise
            for (int i = 0; i < array.length -1; i++){
                if (array[i] > array[i +1]){
                    swap(array, i, i + 1);
                    isSorted = false;
                }
            }
            lastUnsorted--;
        }
    }

    public static void swap(int[] array, int i, int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void main(String[] args) {

    }

}
