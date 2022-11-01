public class SortAlgo {
        public int[] bubbleSort(int[] arr) {
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
        public int[] insertionSort(int[] arr) {
            return arr;
        }

}
