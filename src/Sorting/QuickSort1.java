package Sorting;

public class QuickSort1<E> {

    E[] array;

    public E[] sort (E[] array) {

        this.array = array;
        quickSort(0, array.length - 1);
        return array;


    }

    public void swap (int from, int to){
        E temp = array[from];
        array[from] = array[to];
        array[to] = temp;
    }
    
    private void quickSort(int i, int i1) {
    }


}
