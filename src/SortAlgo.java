import java.util.Random;
public class SortAlgo {
    private static final Random random = new Random();

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
    public Integer[] mergeSort(Integer[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int center = arr.length / 2;
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

        merge(arr, left, right);
        return arr;
    }

    //Merge
    private static void merge(Integer[] arr, Integer[] left, Integer[] right) {
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;
        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] <= right[rightIndex]) {
                arr[resultIndex] = left[leftIndex];
                leftIndex++;
            } else {
                arr[resultIndex] = right[rightIndex];
                rightIndex++;
            }
            resultIndex++;
        }
        while (leftIndex < left.length) {
            arr[resultIndex] = left[leftIndex];
            leftIndex++;
            resultIndex++;
        }
        while (rightIndex < right.length) {
            arr[resultIndex] = right[rightIndex];
            rightIndex++;
            resultIndex++;

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

    public static Integer[] heapsort(Integer[] arr) {
        if (arr == null) return arr;
        int heapSize = arr.length;

        for (int i = Math.max(0, (heapSize / 2) - 1); i >= 0; i--) {
            heapify(arr, heapSize, i);
        }
        for (int i = heapSize -1; i >= 0; i--) {
            Heapswap(arr, 0 , i);
            heapify(arr, i ,0);

        }
        return arr;
    }

    public static void heapify(Integer[] arr, int heapSize, int i) {
        while (true) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int largest = i;

            //right child > parent
            if (right < heapSize && arr[right] > arr[largest]) largest = right;
            //left child > parent
            if (left < heapSize && arr[left] > arr[largest]) largest = left;

            //move to next lower Tree
            if (largest != i) {
                Heapswap(arr, largest, i);
                i = largest;
            } else break;
        }
    }
//End Heap


    //Quick
    public static Integer[] randomizedQuicksort(Integer[] arr) {
        randomizedQuicksort(arr, 0, arr.length - 1);
    return arr;
    }

    public static void randomizedQuicksort(Integer[] arr, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) return;
        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = arr[pivotIndex];
        Quickswap(arr, pivotIndex, highIndex);
        int leftPointer = partition(arr, lowIndex, highIndex, pivot);

        randomizedQuicksort(arr, lowIndex, leftPointer - 1);
        randomizedQuicksort(arr, leftPointer + 1, highIndex);

    }

    private static int partition(Integer[] arr, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
            leftPointer++;
        }
        while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
            leftPointer--;
        }
        Quickswap(arr, leftPointer, rightPointer);
        Quickswap(arr, leftPointer, highIndex);
        return leftPointer;
    }
//End Quick

    //Swap
    public static void Heapswap(Integer[] arr, int i, int j) {
        Integer temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void Quickswap(Integer[] arr, int a, int b) {
        if (a != b) {
            Integer temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
    }
}

