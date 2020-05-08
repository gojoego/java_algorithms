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
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}

/*

int[] intArray = new int[]{3, 60, 35, 2, 45, 320, 5};

1st loop, i = 0, 0 < 7, 0 + 1
[3, 60,] 35, 2, 45, 320, 5 no switch
3, [60, 35,] 2, 45, 320, 5 switch
3, 35, 60, 2, 45, 320, 5
3, 35, [60, 2,] 45, 320, 5 switch
3, 35, 2, 60, 45, 320, 5
3, 35, 2, [60, 45,] 320, 5 switch
3, 35, 2, 45, 60, 320, 5
3, 35, 2, 45, [60, 320,] 5 no switch
3, 35, 2, 45, 60, [320, 5] switch
3, 35, 2, 45, 60, 5, 320
end of 1st loop

2nd loop, i = 1, 1 < 7, 1 + 1
[3, 35,] 2, 45, 60, 5, 320 no switch
3, [35, 2,] 45, 60, 5, 320 switch
3, 2, 35, 45, 60, 5, 320
3, 2, [35, 45,] 60, 5, 320 no switch
3, 2, 35, [45, 60,] 5, 320 no switch
3, 2, 35, 45, [60, 5,] 320 switch
3, 2, 35, 45, 5, 60, 320
3, 2, 35, 45, 5, [60, 320] no switch
3, 2, 35, 45, 5, 60, 320
end of 2nd loop

3rd loop, i = 2, 2 < 7, 2 + 1
[3, 2,] 35, 45, 5, 60, 320 switch
2, 3, 35, 45, 5, 60, 320
2, [3, 35,] 45, 5, 60, 320 no switch
2, 3, [35, 45,] 5, 60, 320 no switch
2, 3, 35, [45, 5,] 60, 320 switch
2, 3, 35, 5, 45, 60, 320
2, 3, 35, 5, [45, 60,] 320 no switch
2, 3, 35, 5, 45, [60, 320] no switch
2, 3, 35, 5, 45, 60, 320
end of 3rd loop

4th loop, i = 3, 3 < 7, 3 + 1
[2, 3,] 35, 5, 45, 60, 320 no switch
2, [3, 35,] 5, 45, 60, 320 no switch
2, 3, [35, 5,] 45, 60, 320 switch
2, 3, 5, 35, 45, 60, 320
2, 3, 5, [35, 45,] 60, 320 no switch
2, 3, 5, 35, [45, 60,] 320 no switch
2, 3, 5, 35, 45, [60, 320] no switch

sorted: 2, 3, 5, 35, 45, 60, 320

*/