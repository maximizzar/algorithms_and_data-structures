public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        Times times = new Times();
        Integer length = 10, min = 1, max = 10;

        //arrayTest(length,min,max,sortAlgo,test);
        print(length,min,max,test,times);
    }
    public static void print(Integer length, Integer min, Integer max, Test test, Times times) {
        for (int i = 0; i < 5; i++) {
            if(i == 0)          length = 10;
            else if (i == 1)    length = 100;
            else if (i == 2)    length = 1000;
            else if (i == 3)    length = 100000;
            else                length = 100000000;

            for (int j = 0; j < 5; j++) {
                if(j == 0)          max = 10;
                else if (j == 1)    max = 100;
                else if (j == 2)    max = 1000;
                else if (j == 3)    max = 100000;
                else max = Integer.MAX_VALUE - 3;

                Long[][] LUL1 = test.mergeSort(length, min, max);
                Long[][] LUL2 = test.randomizedQuicksort(length, min, max);
                Long[][] LUL3 = test.countingSort(length, min, max);
                Long[][] LUL4 = test.heapsort(length, min, max);

                System.out.println(length + " ; " + "PreSortedAscending"    + " ; " + min + " - " + max +
                        " ; " + times.toString(LUL1[0]) +
                        " ; " + times.toString(LUL2[0]) +
                        " ; " + times.toString(LUL3[0]) +
                        " ; " + times.toString(LUL4[0]));

                System.out.println(length + " ; " + "PreSortedDescending"   + " ; " + min + " - " + max +
                        " ; " + times.toString(LUL1[1]) +
                        " ; " + times.toString(LUL2[1]) +
                        " ; " + times.toString(LUL3[1]) +
                        " ; " + times.toString(LUL4[1]));

                System.out.println(length + " ; " + "Unsorted"              + " ; " + min + " - " + max +
                        " ; " + times.toString(LUL1[2]) +
                        " ; " + times.toString(LUL2[2]) +
                        " ; " + times.toString(LUL3[2]) +
                        " ; " + times.toString(LUL4[2]));

                System.out.println();
            }
            System.gc();
        }
    }
}
