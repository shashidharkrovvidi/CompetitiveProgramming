/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
time complexity: O(n) where n is the size of the prices array
space complexity: O(1)
approach: if we form a graph, profit will be the difference between a valley and the following peak.
we add all the differences together to get the maximum profit */
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int i = 0;
        int len = prices.length;
        int peak = -1;
        int valley = -1;
        while(i < len - 1)
        {
            while(i < len - 1 && prices[i] >= prices[i+1])
            {
                i++;
            }
            valley = prices[i];
            while(i<len-1 && prices[i] < prices[i+1])
            {
                i++;
            }
            peak = prices[i];
            profit += peak - valley;
        }
        return profit;
    }
}