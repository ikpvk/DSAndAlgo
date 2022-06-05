package algos.quicksort;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int arr[] = {64, 100, -999, 34, 25, 12, 0, 22, 11, 90, -23, -24, -23};
        System.out.println(Arrays.toString(arr));
        Solution.quickSort(arr, 0, arr.length - 1);
        System.out.println("\nSorted array: ");
        System.out.println(Arrays.toString(arr));

    }
}
