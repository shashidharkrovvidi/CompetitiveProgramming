// https://leetcode.com/problems/search-insert-position/description/
//time complexity: O(logn)
//space complexity: O(1)
class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int high = nums.length - 1;
        int low = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int currNum = nums[mid];
            if (currNum == target) {
                return mid;
            } else if (currNum > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return high + 1;
    }
}