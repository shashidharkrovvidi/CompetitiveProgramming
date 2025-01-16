/**
 * https://leetcode.com/problems/sort-colors/
time complexity: O(n) where n is the size of the nums array
space complexity: O(1)
approach:
we are using the Dutch National Flag algorithm
the intuition is that elements from 0th to low-1 are all zeroes,
the elements from low to mid-1 are all 1s,
the elements from mid to high-1 are unsorted and can be 0,1 and 2,
the elements from high to the last index are all 2s
 */
class SortColors {
    public void sortColors(int[] nums) {
        int low  = 0;
        int mid = 0;
        int high = nums.length-1;
        while(mid<=high)
        {
            int curr = nums[mid];
            if(curr == 0)
            {
                swap(low,mid,nums);
                low++;
                mid++;
            }
            else if(curr == 1)
            {
                mid++;
            }
            else
            {
                swap(high,mid,nums);
                high--;
            }
        }
    }
    private void swap(int swap_indx,int mid,int[] nums)
    {
        int temp = nums[mid];
        nums[mid] = nums[swap_indx];
        nums[swap_indx] = temp;
    }
}