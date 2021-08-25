package algos.bubblesort;

public class Solution {
    public static void bubbleSort(int arr[]) {
        if(null==arr || arr.length==0) {
            return;
        }

        int temp, length = arr.length;
        boolean swapped;

        for(int i = 0; i<length-1; i++) {
            swapped = false;
            for(int j=0 ; j < length-1-i; j++) {
                if(arr[j]> arr[j+1]) {
                    temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                return;
            }
        }

    }
}
