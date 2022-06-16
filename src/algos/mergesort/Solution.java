package algos.mergesort;

public class Solution {
    public static void mergeSort(int[] arr, int start, int end, int[] sortedArr) {
        if(start>=end) {
            return;
        }

        int mid = start + ((end-start)/2);

        mergeSort(arr, start, mid, sortedArr);
        mergeSort(arr, mid+1, end, sortedArr);
        mergeArrays(arr, start, end, mid, sortedArr);
    }

    public static void mergeArrays(int arr[], int leftStart, int rightEnd, int mid, int[] sortedArr) {
        int startIndex = leftStart, endIndex = rightEnd;
        int leftEnd = mid;
        int rightStart = mid + 1;
        int index = leftStart;
        while (leftStart <= leftEnd && rightStart <= rightEnd) {
            if (arr[leftStart] <= arr[rightStart]) {
                sortedArr[index++] = arr[leftStart++];
            } else {
                sortedArr[index++] = arr[rightStart++];
            }
        }

        while (leftStart <= leftEnd) {
            sortedArr[index++] = arr[leftStart++];
        }

        while (rightStart <= rightEnd) {
            sortedArr[index++] = arr[rightStart++];
        }

        while (startIndex <= endIndex) {
            arr[startIndex] = sortedArr[startIndex++];
        }
    }
}
