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

    public void insertionSort(Integer[] A) {
        for (int j = 2; j < A.length; j++) {
            int key = A[j];
            int i = j - 1;

            while (i > 0 && A[i] > key) {
                A[i + 1] = A[i];
                i = i - 1;
            }
            A[i + 1] = key;
        }
    }

    public void mergeSort(Integer[] arr, Integer indexLeft, Integer indexRight) {
        if (indexRight - indexLeft > 1) {

            Integer center = indexRight / 2;

            mergeSort(arr, center , indexRight);
            mergeSort(arr, indexLeft, center);
        }
    }
    public void countingSort(Integer[] arr, Integer biggestInteger) {
        Integer[] counter = new Integer[biggestInteger + 1];
        Integer[] integers = new Integer[arr.length];

        for (int i = 0; i <= arr.length; i++) counter[arr[i]]++;
        for (int i = 1; i <= biggestInteger; i++) counter[arr[i]] = counter[i] + counter[i - 1];
        for (int i = 0; i <= biggestInteger ; i++) {
            integers[counter[arr[i]] - 1] = arr[i];
            counter[arr[i]]--;
        }
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
