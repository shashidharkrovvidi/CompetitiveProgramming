//https://leetcode.com/problems/binary-search/description/
//time complexity: O(logn)
//space complexity: O(1)
class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int currentNum = nums[mid];
            if (currentNum == target) {
                return mid;
            } else if (currentNum > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
