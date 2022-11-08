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
            System.out.println("Hi Mom! No Code here, sorry...");

    }
    public Integer[] randomIntegerArray(Integer length) {
        Integer[] integers = new Integer[length];

        for (int i = 0; i < integers.length; i++) {
            integers[i] = random.nextInt();
        }
        return integers;
    }
}
