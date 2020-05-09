package Sorting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort3 {

    public static void main(String[] args) {

        int[] input = {87, 33, 85, 35, 81, 37};

        System.out.println("unsorted: " + Arrays.toString(input));

        Imperative.insertionSortImperative(input);

        System.out.println("sorted: " + Arrays.toString(input));
    }
}

class Imperative {

    public static void insertionSortImperative(int[] input) {
        for (int i = 1; i < input.length; i++) {
            int key = input[i];
            int j = i - 1;
            while (j >= 0 && input[j] > key) {
                input[j + 1] = input[j];
                j = j - 1;
            }
            input[j + 1] = key;
        }
    }
}

