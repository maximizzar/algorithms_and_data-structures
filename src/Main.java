import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort bubblesort = new BubbleSort();
        int[] arr = {1,2,3,4,5,7,6}; //bubblesort.genArray(10);

        System.out.println(Arrays.toString(arr));

        bubblesort.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
