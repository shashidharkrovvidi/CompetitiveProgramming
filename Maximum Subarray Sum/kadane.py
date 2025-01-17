'''
https://leetcode.com/problems/maximum-subarray/description/
time complexity: O(n) where n is the size of the nums list
space complexity: O(1) 
approach: we are using kadane's algorithm
'''

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        max = -(2**31)
        sum = 0
        for i in range(len(nums)):
            sum = sum + nums[i]
            if sum > max:
                max = sum
            if sum < 0 : # if the next element is negative, the sum will become even smaller and even if it is positive, it is better to take that positive number itself
                sum = 0  
        return max
        