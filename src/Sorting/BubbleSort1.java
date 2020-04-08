package Sorting;

public class BubbleSort1 {

    public static void main(String[] args) {

        int array[] = {3,60,35,2,45,320,5};

        System.out.println("before sort: " + array);

        bubbleSort(array);//sorting array elements using bubble sort

        System.out.println("after sort: " + array);
    }

    static void bubbleSort(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 1; j < array.length -1; j++){
                if (array[j -1] > array[j]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
