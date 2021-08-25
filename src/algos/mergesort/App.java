package algos.mergesort;



import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90, -23, -24, -23 };
        int temp[] = new int[arr.length];
        System.out.println(Arrays.toString(arr));
        Solution.mergeSort(arr,0, arr.length-1, temp);
        System.out.println("\nSorted array: ");
        System.out.println(Arrays.toString(temp));
    }
}
