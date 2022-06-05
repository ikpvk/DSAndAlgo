package algos.quicksort;

public class Solution {
    public static void quickSort(int[] input, int beg, int end) {
        if (beg < end) {
            int partitionPoint = partition(input, beg, end);
            quickSort(input, beg, partitionPoint - 1);
            quickSort(input, partitionPoint + 1, end);
        }

    }

    public static int partition(int[] input, int beg, int end) {
        int pivotValue = input[end];
        int i = beg - 1;
        int j = beg;
        while(j<=end) {
            if(input[j]<pivotValue) {
                i++;
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
            }
            j++;
        }
        i++;
        int temp = input[i];
        input[i] = input[end];
        input[end] = temp;
        return i;
    }
}
