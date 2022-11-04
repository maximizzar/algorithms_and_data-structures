import java.util.concurrent.TimeUnit;
public class Times {
    public void printTimes(Integer[] integers) {
        if(integers[3] != 0) System.out.printf("%3d  s ", integers[3]);
        if(integers[2] != 0) System.out.printf("%3d ms ", integers[2]);
        if(integers[1] != 0) System.out.printf("%3d µs ", integers[1]);
        System.out.printf("%3d ns\n", integers[0]);
    }
    public Integer[] getTimes(Integer duration) {
        Integer[] integers = new Integer[4];
        integers[0] = Math.toIntExact((duration % 1000));
        integers[1] = Math.toIntExact(TimeUnit.NANOSECONDS.toMicros(duration) % 1000);
        integers[2] = Math.toIntExact(TimeUnit.NANOSECONDS.toMillis(duration) % 1000);
        integers[3] = Math.toIntExact(TimeUnit.NANOSECONDS.toSeconds(duration) % 1000);
        return integers;
    }
}
