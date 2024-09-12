//https://www.geeksforgeeks.org/problems/ceil-the-floor2802/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=ceil-the-floor
//time complexity : O(nlogn)
//space complexity: O(1)

import java.util.Arrays;

class FloorCeilInSortedArray {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int high = arr.length - 1;
        int low = 0;
        Arrays.sort(arr);
        if (x > arr[high])
            return new int[] { arr[high], -1 };
        if (x < arr[low])
            return new int[] { -1, arr[low] };
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int currNum = arr[mid];
            if (currNum == x) {
                return new int[] { x, x };
            } else if (currNum > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return new int[] { arr[high], arr[low] };
    }
}