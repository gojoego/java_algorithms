package Sorting;

public class MergeSort1 {

    int[] array;
    int[] temp;

    public void mergeSort(int[] array) {

        this.array = array;
        temp = new int[array.length];
        split(0, array.length - 1);

    }

    private void split(int low, int high) {
        if (low == high) {
            return;
        }
        int mid = (high + low) / 2;
        split(low, mid);
        split(mid + 1, high);
    }

    private void merge(int low, int mid, int high) {

        int i = low;
        int j = mid + 1;
        int tempposn = low;

        while (i <= mid && j <= high) {
            if (array[i] <= array[j]) {
                temp[tempposn++] = array[i++];
            } else {
                temp[tempposn++] = array[j++];
            }
        }
        while (i <= mid) {
            temp[tempposn++] = array[i++];
        }
        while (j <= high){
            temp[tempposn] = array[j++];
        }
        for (tempposn = low; tempposn <= high; tempposn++){
            array[tempposn] = temp[tempposn];
        }
    }

}
