package Sorting;

import java.util.Arrays;

public class BubbleSort3 {

    public static void main(String[] args) {

        int[] arr = new int[]{23, 12, 1, -4, 400, 55, -22, 168};

        // 1st inner loop, j = 1; 1 < 7; 1 + 1
        // 12`, 23`, 1, -4, 400, 55, -22, 168 switch
        // 12, 1`, 23`, -4, 400, 55, -22, 168 switch
        // 12, 1, -4', 23`, 400, 55, -22, 168 switch
        // 12, 1, -4, 23`, 400`, 55, -22, 168 switch
        // 12, 1, -4, 23, 55`, 400`, -22, 168 switch
        // 12, 1, -4, 23, 55, -22`, 400`, 168 switch
        // 12, 1, -4, 23, 55, -22, 168`, 400` switch

        // 2nd inner loop, j = 2; 2 < 7; 2 + 1
        // 1`, 12`, -4, 23, 55, -22, 168, 400 switch
        // 1, -4`, 12`, 23, 55, -22, 168, 400 switch
        // 1, -4, 12`, 23`, 55, -22, 168, 400 no switch
        // 1, -4, 12, 23`, 55`, -22, 168, 400 no switch
        // 1, -4, 12, 23, -22`, 55`, 168, 400 switch
        // 1, -4, 12, 23, -22, 55`, 168`, 400 no switch
        // 1, -4, 12, 23, -22, 55, 168`, 400` no switch

        // 3rd inner loop, j = 3; 3 < 7; 3 + 1
        // -4`, 1`, 12, 23, -22, 55, 168, 400 switch
        // -4, 1`, 12`, 23, -22, 55, 168, 400 no switch
        // -4, 1, 12`, 23`, -22, 55, 168, 400 no switch
        // -4, 1, 12, -22`, 23`, 55, 168, 400 switch
        // -4, 1, 12, -22, 23`, 55`, 168, 400 no switch
        // -4, 1, 12, -22, 23, 55`, 168`, 400 no switch
        // -4, 1, 12, -22, 23, 55, 168`, 400` no switch

        // 4th inner loop, j = 4; 4 < 7; 4 + 1
        // -4`, 1`, 12, -22, 23, 55, 168, 400 no switch
        // -4, 1`, 12`, -22, 23, 55, 168, 400 no switch
        // -4, 1, -22`, 12`, 23, 55, 168, 400 switch
        // -4, 1, -22, 12`, 23`, 55, 168, 400 no switch
        // -4, 1, -22, 12, 23`, 55`, 168, 400 no switch
        // -4, 1, -22, 12, 23, 55`, 168`, 400 no switch
        // -4, 1, -22, 12, 23, 55, 168`, 400` no switch

        // 5th inner loop, j = 5; 5 < 7; 5 + 1
        // -4`, 1`, -22, 12, 23, 55, 168, 400 no switch
        // -4, -22`, 1`, 12, 23, 55, 168, 400 switch
        // -4, -22, 1`, 12`, 23, 55, 168, 400 no switch
        // -4, -22, 1, 12`, 23`, 55, 168, 400 no switch
        // -4, -22, 1, 12, 23`, 55`, 168, 400 no switch
        // -4, -22, 1, 12, 23, 55`, 168`, 400 no switch
        // -4, -22, 1, 12, 23, 55, 168`, 400` no switch

        // 6th inner loop, j = 6; 6 < 7; 6 + 1
        // -22`, -4`, 1, 12, 23, 55, 168, 400 switch
        // -22, -4`, 1`, 12, 23, 55, 168, 400 no switch
        // -22, -4, 1`, 12`, 23, 55, 168, 400 no switch
        // -22, -4, 1, 12`, 23`, 55, 168, 400 no switch
        // -22, -4, 1, 12, 23`, 55`, 168, 400 no switch
        // -22, -4, 1, 12, 23, 55`, 168`, 400 no switch
        // -22, -4, 1, 12, 23, 55, 168`, 400` no switch


        System.out.println("unsorted: " + Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("sorted: " + Arrays.toString(arr));

    }

    static void bubbleSort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 1; j < array.length - 1; j++) {

                if (array[j - 1] > array[j]) {
                    int t = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = t;
                }
            }
        }
    }
}
