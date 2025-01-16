class Solution:
    def swap(self, swap_indx: int, mid: int, nums: List[int]) -> None:
        temp = nums[swap_indx]
        nums[swap_indx] = nums[mid]
        nums[mid] = temp

    def sortColors(self, nums: List[int]) -> None:
        """
        https://leetcode.com/problems/sort-colors/
        Do not return anything, modify nums in-place instead.
        time complexity: O(n) where n is the size of the nums array
        space complexity: O(1)
        approach:
        we are using the Dutch National Flag algorithm
        the intuition is that elements from 0th to low-1 are all zeroes,
        the elements from low to mid-1 are all 1s,
        the elements from mid to high-1 are unsorted and can be 0,1 and 2,
        the elements from high to the last index are all 2s
        """
        low,mid = 0,0
        high = len(nums) - 1

        while mid <= high:
            curr = nums[mid]
            if curr == 0:
                self.swap(low, mid, nums)
                low = low + 1
                mid = mid + 1
            elif curr == 1:
                mid = mid + 1
            else:
                self.swap(high, mid, nums)
                high = high - 1

    

        
        