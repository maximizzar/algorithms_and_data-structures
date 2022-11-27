import java.util.Random;

public class Test {
    private final Random random = new Random();
    private final SortAlgo sortAlgo = new SortAlgo();
    private final Times times = new Times();

    public Integer[][] mergeSort(Integer length, Integer min, Integer max) {

        //PreSortedAscending
        Integer[] array = arrayPreSortedAscending(length,min,max); System.gc();
        @SuppressWarnings("WrapperTypeMayBePrimitive")
        Long startTime = System.nanoTime();

        sortAlgo.mergeSort(array);
        Integer[] preSortedAscending =
                times.getTimes(Math.toIntExact(System.nanoTime() - startTime));

        //PreSortedDescending
        array = arrayPreSortedDescending(length,min,max); System.gc();
        startTime = System.nanoTime();
        sortAlgo.mergeSort(array);
        Integer[] preSortedDescending =
                times.getTimes(Math.toIntExact(System.nanoTime() - startTime));

        //Unsorted
        array = arrayUnsorted(length,min,max); System.gc();
        startTime = System.nanoTime();
        sortAlgo.mergeSort(array);
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
        Integer[] array = arrayPreSortedAscending(length,min,max); System.gc();
        @SuppressWarnings("WrapperTypeMayBePrimitive")
        Long startTime = System.nanoTime();

        sortAlgo.randomizedQuicksort(array);
        Integer[] preSortedAscending =
                times.getTimes(Math.toIntExact(System.nanoTime() - startTime));

        //PreSortedDescending
        array = arrayPreSortedDescending(length,min,max); System.gc();
        startTime = System.nanoTime();
        sortAlgo.randomizedQuicksort(array);
        Integer[] preSortedDescending =
                times.getTimes(Math.toIntExact(System.nanoTime() - startTime));

        //Unsorted
        array = arrayUnsorted(length,min,max); System.gc();
        startTime = System.nanoTime();
        sortAlgo.randomizedQuicksort(array);
        Integer[] unsorted =
                times.getTimes(Math.toIntExact(System.nanoTime() - startTime));

        Integer[][] RETURN = new Integer[3][];
        RETURN[0] = preSortedAscending;
        RETURN[1] = preSortedDescending;
        RETURN[2] = unsorted;

        return RETURN;
    }
    public Integer[][] countingSort(Integer length, Integer min, Integer max) {

        //PreSortedAscending
        Integer[] array = arrayPreSortedAscending(length,min,max); System.gc();
        @SuppressWarnings("WrapperTypeMayBePrimitive")
        Long startTime = System.nanoTime();

        sortAlgo.countingSort(array,max);
        Integer[] preSortedAscending =
                times.getTimes(Math.toIntExact(System.nanoTime() - startTime));

        //PreSortedDescending
        array = arrayPreSortedDescending(length,min,max); System.gc();
        startTime = System.nanoTime();
        sortAlgo.countingSort(array, max);
        Integer[] preSortedDescending =
                times.getTimes(Math.toIntExact(System.nanoTime() - startTime));

        //Unsorted
        array = arrayUnsorted(length,min,max); System.gc();
        startTime = System.nanoTime();
        sortAlgo.countingSort(array, max);
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
        Integer[] array = arrayPreSortedAscending(length, min, max); System.gc();
        @SuppressWarnings("WrapperTypeMayBePrimitive")
        Long startTime = System.nanoTime();

        sortAlgo.heapsort(array);
        Integer[] preSortedAscending =
                times.getTimes(Math.toIntExact(System.nanoTime() - startTime));

        //PreSortedDescending
        array = arrayPreSortedDescending(length,min,max); System.gc();
        startTime = System.nanoTime();
        sortAlgo.heapsort(array);
        Integer[] preSortedDescending =
                times.getTimes(Math.toIntExact(System.nanoTime() - startTime));

        //Unsorted
        array = arrayUnsorted(length,min,max); System.gc();
        startTime = System.nanoTime();
        sortAlgo.heapsort(array);
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
