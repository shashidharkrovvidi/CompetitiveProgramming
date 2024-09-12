//time complexity: O(logn) on average, but could degrade to O(n) in the worst case due to handling duplicates.
//space complexity: O(1)
class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;
        while(low <= high)
        {
            int mid = low + (high-low)/2;
            int currNum = nums[mid];
            if(currNum == target)
            {
                return true;
            }
            else if(currNum == nums[low] && currNum == nums[high]) // this is an edge which is encountered because our numbers can be duplicate
            {
                low = low + 1;
                high = high -1;
            }
            else if(currNum >= nums[low])
            {
                if(target >= nums[low] && target < currNum)
                {
                    high = mid - 1;
                }
                else
                {
                    low = mid + 1;
                }
            }
            else
            {
                if(target <= nums[high] && target > currNum)
                {
                    low = mid + 1;
                }
                else
                {
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}