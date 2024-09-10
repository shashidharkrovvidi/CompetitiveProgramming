#https://leetcode.com/problems/search-insert-position/description/
#time complexity: O(logn)
#space complexity: O(1)
class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        high = len(nums) - 1
        low = 0
        while low <= high:
            mid = int(low + (high-low)/2)
            curr_num = nums[mid]
            if curr_num == target:
                return mid
            elif curr_num > target:
                high = mid - 1
            else :low = mid + 1
        return high + 1
        