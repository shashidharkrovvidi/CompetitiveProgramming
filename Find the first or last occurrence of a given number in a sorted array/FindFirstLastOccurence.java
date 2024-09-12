//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
//time complexity: O(logn)
//space complexity: O(1)
class FindFirstLastOccurrence {
    public int[] searchRange(int[] nums, int target) {
        int firstIndex = findIndex(nums, target, true);
        int lastIndex = findIndex(nums, target, false);
        return new int[] { firstIndex, lastIndex };
    }

    public int findIndex(int[] nums, int target, boolean findFirstIndex) {
        int high = nums.length - 1;
        int low = 0;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int currNum = nums[mid];
            if (currNum > target) {
                high = mid - 1;
            } else if (currNum < target) {
                low = mid + 1;
            } else if (currNum == target && findFirstIndex) {
                high = mid - 1;
                result = mid;
            } else if (currNum == target && !findFirstIndex) {
                low = mid + 1;
                result = mid;
            }
        }
        return result;
    }
}