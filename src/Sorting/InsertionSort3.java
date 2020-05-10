package Sorting;

import java.util.Arrays;

public class InsertionSort3 {

    public static void main(String[] args) {

        int[] array1 = {87, 33, 85, 35, 81, 37};

        System.out.println("unsorted: " + Arrays.toString(array1));

        Imperative.insertionSortImperative(array1);

        System.out.println("sorted: " + Arrays.toString(array1));

        int[] array2 = {817, 3, 89, 36, 82, 40};


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

class Recursive {

    public static void insertionSortRecursive(int[] input, int i) {

        if (i <= 1) {
            return;
        }
        insertionSortRecursive(input, i - 1);
        int key = input[i - 1];
        int j = i - 2;
        while (j >= 0 && input[j] > key) {
            input[j + 1] = input[j];
            j = j - 1;
        }
        input[j + 1] = key;
    }
}


/*

unsorted 87, 33, 85, 35, 81, 37

1st loop:
(int i = 1; i < input.length; i++)
(i = 1; 1 < 6; 1 + 1)

int key = input[i] = input[1] = 33
int j = 1 - 1 = 0

(j >= 0 && input[j] > key)
(0 >= 0 && input[0] = 87 > 33)

input[j + 1] = input[j]
input[1] = input[0], 33, 87
input[1] = 87

temp array: 87, 87, 85, 35, 81, 37

j = j - 1 = -1

input[-1 + 1] = input[0] = key, key = 33, input[0] = 33
after 1st loop: 33, 87, 85, 35, 81, 37

2nd loop:
(int i = 2; i < input.length; i++)
(i = 2; 2 < 6; 2 + 1)

int key = input[i] = input[2] = 85
int j = 2 - 1 = 1

(j >= 0 && input[j] > key)
(1 >= 0 && input[1] = 87 > 85)

input[1 + 1] = input[j]
input[2] = input[1], 85, 87
input[2] = 87

temp array: 33, 87, 87, 35, 81, 37

j = j - 1 = 1 - 1 = 0

(j >= 0 && input[j] > key)
(0 >= 0 && input[0] = 33 > 85)

exits loop

input[j + 1] = input[1] = 85
after 2nd loop: 33, 85, 87, 35, 81, 37

3rd loop:

(int i = 3; i < input.length; i++)
(i = 3; 3 < 6; 3 + 1)

int key = input[3] = 35
int j = 3 - 1 = 2

(j >= 0 && input[j] > key)
(2 >= 0 && input[2] = 87 > 35)

input[2 + 1] = input[3] = input[2] = 87

temp array: 33, 85, 87, 87, 81, 37

j = j - 1 = 2 - 1 = 1

(1 >= 0 && input[1]=85 > 35)

input[1 + 1] = input[2] = input[1] = 85

temp array: 33, 85, 85, 87, 81, 37

j = j - 1 = 1 - 1 = 0

(0 >= 0 && input[0]= 33 > 35)

exits loop

input[0 + 1] = input[1] = key = 35

after 3rd loop: 33, 35, 85, 87, 81, 37

4th loop:

(int i = 4; i < input.length; i++)
(i = 4; 4 < 6; 4 + 1)

int key = input[4] = 81
int j = 4 - 1 = 3

(j >= 0 && input[j] > key)
(3 >= 0 && input[3]=87 > key=81)

input[j+1] = input[3+1] = input[4] = input[3] = 87

temp array: 33, 35, 85, 87, 87, 37

j = j-1 = 3-1 = 2

(2 >= 0 && input[2]=85 > key=81)

input[j+1] = input[2+1] = input[3] = input[2] = 85

temp array: 33, 35, 85, 85, 87, 37

j = j-1 = 2-1 = 1

(1 >= 0 && input[1]=35 > key=81)

exit loop

input[1+1] = input[2] = key = 81

after 4th loop: 33, 35, 81, 85, 87, 37


5th loop:

(int i = 5; i < input.length; i++)
(i = 5; 5 < 6; 5+1)

int key = input[5] = 37
int j = i-1 = 5-1 = 4

(j >= 0 && input[j] > key)
(4 >= 0 && input[4]=87 > key=37)

input[j+1] = input[4+1] = input[5] = input[4] = 87

temp array: 33, 35, 81, 85, 87, 87

j = j-1 = 4-1 = 3

(j >= 0 && input[j] > key)
(3 >= 0 && input[3]=85 > key=37)

input[3+1] = input[4] = input[3] = 85

temp array: 33, 35, 81, 85, 85, 87

j = j-1 = 3-1 = 2

(2 >= 0 && input[3]=85 > key=37)

input[j+1]=input[2+1]=input[3]=input[2]=81

temp array: 33, 35, 81, 81, 85, 87

j=j-1=2-1= 1

(1 >= 0 && input[1]=35 > key=37)

exit loop

input[j+1]=input[1+1]=input[2]=key=37

after 5th loop: 33, 35, 37, 81, 85, 87

sorted: 33, 35, 37, 81, 85, 87

*/