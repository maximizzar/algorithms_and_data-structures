public class Main {
    public static void main(String[] args) {
        long start;
        int repetitions = 10, length = 10000;

        SortAlgo sortAlgo = new SortAlgo();
        Times times = new Times();

        /*
            Sort Tests
         */

        //bubbleSort
        System.out.println("bubbleSort: ");
        long bubbleSortDuration = 0L;

        for (int i = 0; i < repetitions; i++) {
            start = System.nanoTime();
            sortAlgo.bubbleSort(sortAlgo.randomIntegerArray(length));
            bubbleSortDuration += Math.toIntExact(System.nanoTime() - start);
        }
        times.printTimes(times.getTimes(Math.toIntExact(bubbleSortDuration / repetitions)));

        //insertionSort
        System.out.println("insertionSort: ");
        long insertionSortDuration = 0L;

        for (int i = 0; i < repetitions; i++) {
            start = System.nanoTime();
            sortAlgo.insertionSort(sortAlgo.randomIntegerArray(length));
            insertionSortDuration += Math.toIntExact(System.nanoTime() - start);
        }
        times.printTimes(times.getTimes(Math.toIntExact(insertionSortDuration / repetitions)));
    }
}
