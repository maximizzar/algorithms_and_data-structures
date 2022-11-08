import java.util.Objects;

public class SearchAlgo {
    public Integer linearSearch(Integer[] arr, Integer x) {
        for (int i = 0; i < arr.length; i++) {
            if(Objects.equals(arr[i], x)) {
                return i;
            }
        }
        return - 1;
    }
    public Integer binarySearch(Integer[] arr, Integer l, Integer r) {

        return -1;
    }
}
