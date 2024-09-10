//https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1?track=DSASP-Searching&amp%253BbatchId=154&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=floor-in-a-sorted-array
//time complexity: O(logn)
//space complexity: O(1)
class Solution {
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x) {
        int high = n - 1;
        int low = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long currNum = arr[mid];
            if (currNum == x) {
                return mid;
            } else if (currNum > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return high;

    }
}