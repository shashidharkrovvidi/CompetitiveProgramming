/**
 * https://leetcode.com/problems/maximum-subarray/description/
time complexity: O(n)
space complexity: O(1) 
approach: we are using Kadane's algorithm to find the max subarray sum*/
class Solution {
    public int Kadane(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int curr : nums)
        {
            sum += curr;
            if(sum > max)
            {
                max = sum;
            }
            if(sum < 0) // if the next element is negative, the sum will become even smaller and even if it is positive, it is better to take that positive number itself
            {
                sum = 0;
            }
        }
        return max;
    }
}