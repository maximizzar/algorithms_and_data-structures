import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(printTime(start, System.nanoTime()));

        /*
            Sort Tests
         */

        SortAlgo sortAlgo = new SortAlgo();
        int[] arr = {1,2,3,4,5,7,6};

        System.out.println(Arrays.toString(arr));
        sortAlgo.insertionSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    public static String printTime(long start, long end) {
        long duration = end - start;
        duration = 1000000;
        if(duration > 1000) {
            //return "Code took" + TimeUnit.NANOSECONDS.toMicros(duration) + "µs";
        }
        return "Code took " + duration + "ns";

    }
}
