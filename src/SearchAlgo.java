public class SearchAlgo {

    public int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x) {
                return i;
            }
        }
        return - 1;
    }
    public int binarySearch(int[] arr, int l, int r) {

        return -1;
    }
}
