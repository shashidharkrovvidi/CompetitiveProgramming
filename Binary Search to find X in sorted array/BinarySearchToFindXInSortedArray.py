#time complexity: O(logn)
#space complexity: O(1)
class Solution:
    def search(self, nums: List[int], target: int) -> int:
        low = 0
        high = len(nums) -1 
        while low <= high:
            mid = (int)(low + (high-low)/2)
            current_num = nums[mid]
            if current_num == target:
                return mid
            elif current_num > target:
                high = mid - 1
            else:
                 low = mid + 1
        return -1  