import java.util.Arrays;
import java.util.Random;

public class Test {
    private final Random random = new Random();
    private final SortAlgo sortAlgo = new SortAlgo();
    private final Times times = new Times();

    public String[] mergeSort(Integer length, Integer min, Integer max) {
        //PreSortedAscending
        @SuppressWarnings("WrapperTypeMayBePrimitive")
        Long startTime = System.nanoTime();

        sortAlgo.mergeSort(arrayPreSortedAscending(length),0,length);
        String preSortedAscending =
                Arrays.toString(times.getTimes(Math.toIntExact(System.nanoTime() - startTime)));

        //PreSortedDescending
        startTime = System.nanoTime();
        sortAlgo.mergeSort(arrayPreSortedDescending(length),0,length);
        String preSortedDescending =
                Arrays.toString(times.getTimes(Math.toIntExact(System.nanoTime() - startTime)));

        //Unsorted
        startTime = System.nanoTime();
        sortAlgo.mergeSort(arrayUnsorted(length,min,max),0,length);
        String unsorted =
                Arrays.toString(times.getTimes(Math.toIntExact(System.nanoTime() - startTime)));

        return new String[]{preSortedAscending, preSortedDescending, unsorted};
    }

    public String[] randomizedQuicksort(Integer length, Integer min, Integer max) {
        //PreSortedAscending
        @SuppressWarnings("WrapperTypeMayBePrimitive")
        Long startTime = System.nanoTime();

        sortAlgo.randomizedQuicksort(arrayPreSortedAscending(length));
        String preSortedAscending =
                Arrays.toString(times.getTimes(Math.toIntExact(System.nanoTime() - startTime)));

        //PreSortedDescending
        startTime = System.nanoTime();
        sortAlgo.randomizedQuicksort(arrayPreSortedDescending(length));
        String preSortedDescending =
                Arrays.toString(times.getTimes(Math.toIntExact(System.nanoTime() - startTime)));

        //Unsorted
        startTime = System.nanoTime();
        sortAlgo.randomizedQuicksort(arrayUnsorted(length,min,max));
        String unsorted =
                Arrays.toString(times.getTimes(Math.toIntExact(System.nanoTime() - startTime)));

        return new String[]{preSortedAscending, preSortedDescending, unsorted};
    }

    public String[] coutingSort(Integer length, Integer min, Integer max) {
        //PreSortedAscending
        @SuppressWarnings("WrapperTypeMayBePrimitive")
        Long startTime = System.nanoTime();

        sortAlgo.countingSort(arrayPreSortedAscending(length),max);
        String preSortedAscending =
                Arrays.toString(times.getTimes(Math.toIntExact(System.nanoTime() - startTime)));

        //PreSortedDescending
        startTime = System.nanoTime();
        sortAlgo.countingSort(arrayPreSortedDescending(length), max);
        String preSortedDescending =
                Arrays.toString(times.getTimes(Math.toIntExact(System.nanoTime() - startTime)));

        //Unsorted
        startTime = System.nanoTime();
        sortAlgo.countingSort(arrayUnsorted(length,min,max), max);
        String unsorted =
                Arrays.toString(times.getTimes(Math.toIntExact(System.nanoTime() - startTime)));

        return new String[]{preSortedAscending, preSortedDescending, unsorted};
    }

    public String[] heapsort(Integer length, Integer min, Integer max) {
        //PreSortedAscending
        @SuppressWarnings("WrapperTypeMayBePrimitive")
        Long startTime = System.nanoTime();

        sortAlgo.heapsort(arrayPreSortedAscending(length));
        String preSortedAscending =
                Arrays.toString(times.getTimes(Math.toIntExact(System.nanoTime() - startTime)));

        //PreSortedDescending
        startTime = System.nanoTime();
        sortAlgo.heapsort(arrayPreSortedDescending(length));
        String preSortedDescending =
                Arrays.toString(times.getTimes(Math.toIntExact(System.nanoTime() - startTime)));

        //Unsorted
        startTime = System.nanoTime();
        sortAlgo.heapsort(arrayUnsorted(length,min,max));
        String unsorted =
                Arrays.toString(times.getTimes(Math.toIntExact(System.nanoTime() - startTime)));

        return new String[]{preSortedAscending, preSortedDescending, unsorted};
    }

    /*
        array init
     */

    private Integer[] arrayPreSortedAscending(Integer length) {
        Integer[] integers = new Integer[length];

        for (int i = 0; i < integers.length; i++) {
            integers[i] = i + 1;
        }
        return integers;
    }
    private Integer[] arrayPreSortedDescending(Integer length) {
        Integer[] integers = new Integer[length];

        for (int i = 0; i < integers.length; i++) {
            integers[i] = integers.length - i + 1;
        }
        return integers;
    }
    private Integer[] arrayUnsorted(Integer length, Integer min, Integer max) {
        Integer[] integers = new Integer[length];

        for (int i = 0; i < integers.length; i++) {
            integers[i] = randomInteger(min,max);
        }
        return integers;
    }
    private Integer randomInteger(Integer min, Integer max) {return random.nextInt(min,max);}
}
