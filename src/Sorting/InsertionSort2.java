package Sorting;

public class InsertionSort2 {



    public static void main(String[] args) {

        int[] array = new int[20];

        for (int i = 1; i < array.length; i++){
            int j, v = array[i];
            for (j = i - 1; i >= 0; j--){
                if (array[j] <= v) {
                    break;
                }
            }
            
        }

    }

}
