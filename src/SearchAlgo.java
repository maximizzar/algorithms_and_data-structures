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
    public Integer binarySearch(Integer[] arr, Integer l, Integer r, Integer key) {
        if(Objects.equals(arr[r/2], key)) return r/2;

        if(arr[r/2] > key) binarySearch(arr, l, r/2,key);
        binarySearch(arr, r/2 -1, r,key);

        return -1;
    }
}
