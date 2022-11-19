import java.util.Arrays;
import java.util.Random;
public class SortAlgo {
    private final Random random = new Random();
    public void bubbleSort(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean sorted = true;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    sorted = false;
                    int buffer = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = buffer;
                }
            }
            if (sorted) break;
        }
    }

    public void insertionSort(Integer[] arr) {
        for (int j = 2; j < arr.length; j++) {
            int key = arr[j];
            int i = j - 1;

            while (i > 0 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i = i - 1;
            }
            arr[i + 1] = key;
        }
    }

    public void mergeSort(Integer[] arr, Integer indexLeft, Integer indexRight) {
        if (indexRight - indexLeft > 1) {

            Integer center = indexRight / 2;

            mergeSort(arr, center , indexRight);
            mergeSort(arr, indexLeft, center);
        }
    }
    public int[] countingSort(Integer[] array, Integer biggestInt) {
        System.out.print("array: ");
        int[] c = new int[biggestInt + 1];
        int[] output = new int[array.length];

        //count numbers in array
        for (Integer value : array) c[value]++;

        //accumulate numbers in c
        for (int i = 1; i <= biggestInt; i++) {
            c[i] = c[i - 1] + c[i];
            /*
                i   [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
                c1: [2, 1, 1, 1, 1, 1, 1, 1, 1, 6]

                c1: [2, 3, 4, 5, 6, 7, 8, 9,10,16]
             */
        }

        for (int i = array.length - 1; i >= 0; i--) {
            output[c[array[i]] - 1] = array[i];
            c[array[i]]--;
        }
        return output;
    }
    public void radixSort(Integer[] arr) {

    }
    public Integer[] randomIntegerArray(Integer length) {
        Integer[] integers = new Integer[length];

        for (int i = 0; i < integers.length; i++) {
            integers[i] = random.nextInt(412) + 100;
        }
        return integers;
    }
}
