import java.util.concurrent.TimeUnit;
public class Times {
    public String toString(Long[] longs) {
        String RETURN = "";
        RETURN += longs[3] + "s ";
        RETURN += longs[2] + "ms ";
        RETURN += longs[1] + "µs ";
        RETURN += longs[0] + "ns";
        return RETURN;
    }
    public void printTimes(Long[] longs) {
        if(longs[3] != 0) System.out.printf("%3d  s ", longs[3]);
        if(longs[2] != 0) System.out.printf("%3d ms ", longs[2]);
        if(longs[1] != 0) System.out.printf("%3d µs ", longs[1]);
        System.out.printf("%3d ns\n", longs[0]);
    }
    public Long[] getTimes(Long duration) {
        Long[] longs = new Long[4];
        longs[0] = (duration % 1000);
        longs[1] = TimeUnit.NANOSECONDS.toMicros(duration) % 1000;
        longs[2] = TimeUnit.NANOSECONDS.toMillis(duration) % 1000;
        longs[3] = TimeUnit.NANOSECONDS.toSeconds(duration) % 1000;
        return longs;
    }
}
