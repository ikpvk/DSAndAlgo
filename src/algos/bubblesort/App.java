package algos.bubblesort;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        System.out.println(Arrays.toString(arr));
        Solution.bubbleSort(arr);
        System.out.println("\nSorted array: ");
        System.out.println(Arrays.toString(arr));
    }
}
