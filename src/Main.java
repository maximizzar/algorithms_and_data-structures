import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InitTests initTests = new InitTests(8, 8192);
        SortAlgo sortAlgo = new SortAlgo();
        Times times = new Times();
        Scanner scanner = new Scanner(System.in);

        System.out.printf("if you want to change default type yes. Default: %s\n", initTests);
        if(scanner.next().equalsIgnoreCase("yes")) {
            System.out.println("enter repetitions");
            initTests.setRepetitions(scanner.nextInt());
            System.out.println("enter arraySize");
            initTests.setArraySize(scanner.nextInt());
        }
        scanner.close();

        /*
            Sort Tests
         */


        //bubbleSort
        System.out.println("bubbleSort: ");
        Long bubbleSortDuration = 0L;

        for (int i = 0; i < initTests.getRepetitions(); i++) {
            initTests.setTestStart();
            sortAlgo.bubbleSort(sortAlgo.randomIntegerArray(initTests.getArraySize()));
            bubbleSortDuration += Math.toIntExact(System.nanoTime() - initTests.getTestStart());
        }
        times.printTimes(times.getTimes(Math.toIntExact(bubbleSortDuration / initTests.getRepetitions())));


        //insertionSort
        System.out.println("insertionSort: ");
        int insertionSortDuration = 0;

        for (int i = 0; i < initTests.getRepetitions(); i++) {
            initTests.setTestStart();
            sortAlgo.insertionSort(sortAlgo.randomIntegerArray(initTests.getArraySize()));
            insertionSortDuration += Math.toIntExact(System.nanoTime() - initTests.getTestStart());
        }
        times.printTimes(times.getTimes(Math.toIntExact(insertionSortDuration / initTests.getRepetitions())));
    }
}
