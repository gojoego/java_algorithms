package Sorting;

/*

QuickSort algorithm

-useful for sorting large lists and arrays
-divide and conquer algorithm:
    -original array divided into 2 arrays
    -each sorted individually
    -sorted output merged to produce sorted array
-average complexity: O(n log n)
-repeatedly divides un-sorted section into lower
    order sub-section and higher order sub-section
    by comparing to pivot element
-get sorted array at end of recursion
-can be implemented to sort "in-place"
-sorting takes place in array an no additional arrays
    need to be created

algorithm steps: if array contains only one or zero elements then array sorted,
if array contains more than 1 element then:

1. select element as pivot element, generally from middle but not always
2. data elements groups into 2 parts
    -one with elements in lower order than pivot element
    -one with element in higher order than pivot element
3. sort both parts separately by repeating step 1 and 2

*/

import java.util.Arrays;

public class QuickSort2 {

    public static void main(String[] args) {

        Integer[] array = new Integer[]{12, 133, 24, 10, 33, 61, 90, 70, 100, 2000};

        System.out.println("unsorted: " + Arrays.toString(array));

        quickSort(array, 0, array.length - 1);

        System.out.println("sorted: " + Arrays.toString(array));

    }

    public static void quickSort(Integer[] array, int low, int high) {

        // check for empty or null array
        if (array == null || array.length == 0) {
            return;
        }

        if (low >= high) {
            return;
        }

        // get pivot element from middle of list
        int middle = low + (high - low) / 2;
        int pivot = array[middle];

        // make left < pivot and right > pivot
        int i = low;
        int j = high;

        while (i <= j) {

            // check until all values on left side array lower than pivot
            while (array[i] < pivot) {
                i++;
            }

            // check until all values on left side array greater than pivot
            while (array[j] > pivot) {
                j--;
            }

            // compare values from both side of lists to see if swapping needed
            // after swapping move iterator on both lists
            if (i <= j) {
                swap(array, i, j);
                i++;
                j--;
            }
        }
        // so same operation to sort two sub arrays
        if (low < j){
            quickSort(array, low, j);
        }
        if (high>i){
            quickSort(array, i, high);
        }
    }

    public static void swap(Integer array[], int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}

/*

Arrays.sort() method uses quick sort algorithm to sort array of primitives
using double pivot elements

Double pivot speeds up algorithm

example taken from https://howtodoinjava.com/algorithm/quicksort-java-example/

*/


