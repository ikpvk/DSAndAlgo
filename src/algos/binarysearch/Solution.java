package algos.binarysearch;

public class Solution {

    public static int binarySearch(int[] array, int k) {
        if(null==array || array.length==0) {
            return -1;
        }
        int left = 0, right = array.length-1, mid;

        while(left<=right) {
            mid = left + ((right - left)/2);
            if(array[mid]==k) {
                return mid;
            }

            if(array[mid] > k) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return -1;
    }
}
