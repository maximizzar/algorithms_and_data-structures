import java.util.Random;

public class BubbleSort {
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean sorted = true;
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    sorted = false;
                    int buffer = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = buffer;
                }
            }
            if(sorted) break;
        }
        return arr;
    }
    public int[] genArray(int length) {
        Random random = new Random();
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.abs(random.nextInt());
        }
        return arr;
    }
}
