import java.util.Random;

public class Test {
    private final Random random = new Random();
    private final SortAlgo sortAlgo = new SortAlgo();
    private final Times times = new Times();

    public Long[][] mergeSort(Integer length, Integer min, Integer max) {

        //PreSortedAscending
        Integer[] array = arrayPreSortedAscending(length,min,max); System.gc();
        @SuppressWarnings("WrapperTypeMayBePrimitive")
        Long startTime = System.nanoTime();

        sortAlgo.mergeSort(array);
        Long[] preSortedAscending =
                times.getTimes(System.nanoTime() - startTime);

        //PreSortedDescending
        array = arrayPreSortedDescending(length,min,max); System.gc();
        startTime = System.nanoTime();
        sortAlgo.mergeSort(array);
        Long[] preSortedDescending =
                times.getTimes(System.nanoTime() - startTime);

        //Unsorted
        array = arrayUnsorted(length,min,max); System.gc();
        startTime = System.nanoTime();
        sortAlgo.mergeSort(array);
        Long[] unsorted =
                times.getTimes(System.nanoTime() - startTime);

        Long[][] RETURN = new Long[3][];
        RETURN[0] = preSortedAscending;
        RETURN[1] = preSortedDescending;
        RETURN[2] = unsorted;

        return RETURN;
    }
    public Long[][] randomizedQuicksort(Integer length, Integer min, Integer max) {

        //PreSortedAscending
        Integer[] array = arrayPreSortedAscending(length,min,max); System.gc();
        @SuppressWarnings("WrapperTypeMayBePrimitive")
        Long startTime = System.nanoTime();

        sortAlgo.randomizedQuicksort(array);
        Long[] preSortedAscending =
                times.getTimes(System.nanoTime() - startTime);

        //PreSortedDescending
        array = arrayPreSortedDescending(length,min,max); System.gc();
        startTime = System.nanoTime();
        sortAlgo.randomizedQuicksort(array);
        Long[] preSortedDescending =
                times.getTimes(System.nanoTime() - startTime);

        //Unsorted
        array = arrayUnsorted(length,min,max); System.gc();
        startTime = System.nanoTime();
        sortAlgo.randomizedQuicksort(array);
        Long[] unsorted =
                times.getTimes(System.nanoTime() - startTime);

        Long[][] RETURN = new Long[3][];
        RETURN[0] = preSortedAscending;
        RETURN[1] = preSortedDescending;
        RETURN[2] = unsorted;

        return RETURN;
    }
    public Long[][] countingSort(Integer length, Integer min, Integer max) {

        //PreSortedAscending
        Integer[] array = arrayPreSortedAscending(length,min,max); System.gc();
        @SuppressWarnings("WrapperTypeMayBePrimitive")
        Long startTime = System.nanoTime();

        sortAlgo.countingSort(array,max);
        Long[] preSortedAscending =
                times.getTimes(System.nanoTime() - startTime);

        //PreSortedDescending
        array = arrayPreSortedDescending(length,min,max); System.gc();
        startTime = System.nanoTime();
        sortAlgo.countingSort(array, max);
        Long[] preSortedDescending =
                times.getTimes(System.nanoTime() - startTime);

        //Unsorted
        array = arrayUnsorted(length,min,max); System.gc();
        startTime = System.nanoTime();
        sortAlgo.countingSort(array, max);
        Long[] unsorted =
        times.getTimes(System.nanoTime() - startTime);

        Long[][] RETURN = new Long[3][];
        RETURN[0] = preSortedAscending;
        RETURN[1] = preSortedDescending;
        RETURN[2] = unsorted;

        return RETURN;
    }
    public Long[][] heapsort(Integer length, Integer min, Integer max) {

        //PreSortedAscending
        Integer[] array = arrayPreSortedAscending(length, min, max); System.gc();
        @SuppressWarnings("WrapperTypeMayBePrimitive")
        Long startTime = System.nanoTime();

        sortAlgo.heapsort(array);
        Long[] preSortedAscending =
                times.getTimes(System.nanoTime() - startTime);

        //PreSortedDescending
        array = arrayPreSortedDescending(length,min,max); System.gc();
        startTime = System.nanoTime();
        sortAlgo.heapsort(array);
        Long[] preSortedDescending =
                times.getTimes(System.nanoTime() - startTime);

        //Unsorted
        array = arrayUnsorted(length,min,max); System.gc();
        startTime = System.nanoTime();
        sortAlgo.heapsort(array);
        Long[] unsorted =
                times.getTimes(System.nanoTime() - startTime);

        Long[][] RETURN = new Long[3][];
        RETURN[0] = preSortedAscending;
        RETURN[1] = preSortedDescending;
        RETURN[2] = unsorted;

        return RETURN;
    }

    /*
        array init
     */

    public Integer[] arrayPreSortedAscending(Integer length, Integer min, Integer max) {
        return sortAlgo.mergeSort(arrayUnsorted(length,min,max));
    }
    public Integer[] arrayPreSortedDescending(Integer length, Integer min, Integer max) {
        Integer[] integers = sortAlgo.mergeSort(arrayUnsorted(length,min,max));

        for (int i = 0; i < integers.length / 2; i++) {
            Integer temp = integers[i];
            integers[i] = integers[integers.length - 1 - i];
            integers[integers.length - 1 - i] = temp;
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
