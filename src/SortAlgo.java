import java.util.Random;
public class SortAlgo {
    private final Random random = new Random();
    public Integer[] bubbleSort(Integer[] arr) {
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
        return arr;
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

    //Sort
    public void mergeSort(Integer[] arr) {
        if (arr.length <= 1) {
            return;
        }

        Integer center = arr.length / 2;
        Integer[] left = new Integer[center];
        Integer[] right = new Integer[arr.length - center];

        for (int i = 0; i < left.length; i++) {
            left[i] = arr[i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = arr[i + left.length];
        }

        mergeSort(left);
        mergeSort(right);

    }
    //Merge
    public static void merge(Integer[] left, Integer[] right) {
        Integer[] result = new Integer[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;
        while (leftIndex < left.length || rightIndex < right.length) {
            if (leftIndex < left.length && rightIndex < right.length) {
                if(left[leftIndex] <= right[rightIndex]) {
                    result[resultIndex++] = left[leftIndex++];
                }else {
                    result[resultIndex++] = left[rightIndex++];
                }
            }   else if (leftIndex < left.length) {
                result[resultIndex++] = left[leftIndex++];
            }   else if (rightIndex < right.length) {
                result[resultIndex++] = right[rightIndex];
            }
        }
    }

    public int[] countingSort(Integer[] array, Integer biggestInt) {
        int[] c = new int[biggestInt + 1];
        int[] output = new int[array.length];

        //count numbers in array
        for (Integer value : array) c[value]++;

        //accumulate numbers in c
        for (int i = 1; i <= biggestInt; i++) {
            c[i] = c[i - 1] + c[i];
        }

        for (int i = array.length - 1; i >= 0; i--) {
            output[c[array[i]] - 1] = array[i];
            c[array[i]]--;
        }
        return output;
    }
    public void radixSort(Integer[] arr) {

    }

       public  <T> void heapsort(Integer[] arr) {
        int heapSize = arr.length;
        buildHeap(arr, heapSize);
        while (heapSize > 1) {
            Heapswap(arr, 0, heapSize - 1);
            heapSize--;
            heapify(arr, heapSize, 0);
        }
    }
    public static <T> void buildHeap(Integer[] arr, int heapSize) {
        for (int i = (int) (arr.length / 2); i >= 0; i++) {
            heapify(arr, heapSize, i);
        }
    }
    public static <T> void heapify(Integer[] arr, int heapSize, int i) {
        int left = i * 2 +1;
        int right = i * 2 + 2;
        int largest ;
        if (left < heapSize && arr[left].compareTo(arr[i]) > 0)
            largest = left;
        else largest = i;
        if (right < heapSize && arr[right].compareTo(arr[largest]) > 0) {
            largest = right;
        }
        if (largest != i) {
            Heapswap(arr, i, largest);
            heapify(arr, heapSize, largest);
        }
    }
//End Heap

    //Quick
    private static <T> int partition (Integer[] arr, int left, int right) {
        Integer pivot = arr[right];
        int mid = left;
        for (int i = mid; i < right; i++) {
            if (arr[i].compareTo(pivot) <= 0) {
                Quickswap(arr, i, mid++);
            }
        }
        Quickswap(arr, right, mid);
        return mid;
    }
    public  <T> void randomizedQuicksort(Integer[] arr) {
        randomizedQuicksort(arr, 0, arr.length -1);
    }
    public  <T> void randomizedQuicksort(Integer[] arr, int left, int right) {
        if (left < right) {
            int pivot = randomPartition(arr, left, right);
            randomizedQuicksort(arr, left, pivot -1);
            randomizedQuicksort(arr, pivot +1, right);
        }
    }
    public static <T> int randomPartition(Integer[] arr, int left, int right) {
        int pivot = left + random.nextInt(right - left);
        Quickswap(arr, right, pivot);
        return partition(arr, left, right);
    }
//End Quick

    //Swap Classes
    public static <T> void Heapswap (Integer[] arr, int a, int b) {
        Integer temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static <T> void Quickswap (Integer[] arr, int a, int b) {
        if (a != b) {
            Integer temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
    }
}
