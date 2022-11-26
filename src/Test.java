import java.util.Random;

public class Test {
    private final Random random = new Random();
    private final SortAlgo sortAlgo = new SortAlgo();
    private final Times times = new Times();

    public Integer[][] mergeSort(Integer length, Integer min, Integer max) {

        //PreSortedAscending
        @SuppressWarnings("WrapperTypeMayBePrimitive")
        Long startTime = System.nanoTime();

        sortAlgo.mergeSort(arrayPreSortedAscending(length),0,length);
        Integer[] preSortedAscending =
                times.getTimes(Math.toIntExact(System.nanoTime() - startTime));

        //PreSortedDescending
        startTime = System.nanoTime();
        sortAlgo.mergeSort(arrayPreSortedDescending(length),0,length);
        Integer[] preSortedDescending =
                times.getTimes(Math.toIntExact(System.nanoTime() - startTime));

        //Unsorted
        startTime = System.nanoTime();
        sortAlgo.mergeSort(arrayUnsorted(length,min,max),0,length);
        Integer[] unsorted =
                times.getTimes(Math.toIntExact(System.nanoTime() - startTime));

        Integer[][] RETURN = new Integer[3][];
        RETURN[0] = preSortedAscending;
        RETURN[1] = preSortedDescending;
        RETURN[2] = unsorted;

        return RETURN;
    }
    public Integer[][] randomizedQuicksort(Integer length, Integer min, Integer max) {

        //PreSortedAscending
        @SuppressWarnings("WrapperTypeMayBePrimitive")
        Long startTime = System.nanoTime();

        sortAlgo.randomizedQuicksort(arrayPreSortedAscending(length));
        Integer[] preSortedAscending =
                times.getTimes(Math.toIntExact(System.nanoTime() - startTime));

        //PreSortedDescending
        startTime = System.nanoTime();
        sortAlgo.randomizedQuicksort(arrayPreSortedDescending(length));
        Integer[] preSortedDescending =
                times.getTimes(Math.toIntExact(System.nanoTime() - startTime));

        //Unsorted
        startTime = System.nanoTime();
        sortAlgo.randomizedQuicksort(arrayUnsorted(length,min,max));
        Integer[] unsorted =
                times.getTimes(Math.toIntExact(System.nanoTime() - startTime));

        Integer[][] RETURN = new Integer[3][];
        RETURN[0] = preSortedAscending;
        RETURN[1] = preSortedDescending;
        RETURN[2] = unsorted;

        return RETURN;
    }
    public Integer[][] coutingSort(Integer length, Integer min, Integer max) {

        //PreSortedAscending
        @SuppressWarnings("WrapperTypeMayBePrimitive")
        Long startTime = System.nanoTime();

        sortAlgo.countingSort(arrayPreSortedAscending(length),max);
        Integer[] preSortedAscending =
                times.getTimes(Math.toIntExact(System.nanoTime() - startTime));

        //PreSortedDescending
        startTime = System.nanoTime();
        sortAlgo.countingSort(arrayPreSortedDescending(length), max);
        Integer[] preSortedDescending =
                times.getTimes(Math.toIntExact(System.nanoTime() - startTime));

        //Unsorted
        startTime = System.nanoTime();
        sortAlgo.countingSort(arrayUnsorted(length,min,max), max);
        Integer[] unsorted =
        times.getTimes(Math.toIntExact(System.nanoTime() - startTime));

        Integer[][] RETURN = new Integer[3][];
        RETURN[0] = preSortedAscending;
        RETURN[1] = preSortedDescending;
        RETURN[2] = unsorted;

        return RETURN;
    }
    public Integer[][] heapsort(Integer length, Integer min, Integer max) {

        //PreSortedAscending
        @SuppressWarnings("WrapperTypeMayBePrimitive")
        Long startTime = System.nanoTime();

        sortAlgo.heapsort(arrayPreSortedAscending(length));
        Integer[] preSortedAscending =
                times.getTimes(Math.toIntExact(System.nanoTime() - startTime));

        //PreSortedDescending
        startTime = System.nanoTime();
        sortAlgo.heapsort(arrayPreSortedDescending(length));
        Integer[] preSortedDescending =
                times.getTimes(Math.toIntExact(System.nanoTime() - startTime));

        //Unsorted
        startTime = System.nanoTime();
        sortAlgo.heapsort(arrayUnsorted(length,min,max));
        Integer[] unsorted =
                times.getTimes(Math.toIntExact(System.nanoTime() - startTime));

        Integer[][] RETURN = new Integer[3][];
        RETURN[0] = preSortedAscending;
        RETURN[1] = preSortedDescending;
        RETURN[2] = unsorted;

        return RETURN;
    }

    /*
        array init
     */

    public Integer[] arrayPreSortedAscending(Integer length) {
        //fix it
        Integer[] integers = new Integer[length];

        for (int i = 0; i < integers.length; i++) {
            integers[i] = i + 1;
        }
        return integers;
    }
    public Integer[] arrayPreSortedDescending(Integer length) {
        //fix it
        Integer[] integers = new Integer[length];

        for (int i = 0; i < integers.length; i++) {
            integers[i] = integers.length - i;
        }
        return integers;
    }
    public Integer[] arrayUnsorted(Integer length, Integer min, Integer max) {
        Integer[] integers = new Integer[length];

        for (int i = 0; i < integers.length; i++) {
            integers[i] = random.nextInt(min,max);
        }
        return integers;
    }
}
