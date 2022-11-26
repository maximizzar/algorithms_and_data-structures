public class Main {
    public static void main(String[] args) {
        System.out.println("hi mom");
        Test test = new Test();

        Integer length = 10, min = 1, max = 10;

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
                else max = Integer.MAX_VALUE;

                test.mergeSort(length,min,max);
                test.randomizedQuicksort(length,min,max);
                test.coutingSort(length,min,max);
                test.heapsort(length,min,max);
            }
        }
    }
}
