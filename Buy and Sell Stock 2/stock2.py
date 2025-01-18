'''
https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
time complexity: O(n) where n is the size of the prices list
space complexity: O(1)
approach: if we form a graph, profit will be the difference between a valley and the following peak.
we add all the differences together to get the maximum profit
'''
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0
        length = len(prices)
        i = 0
        while i < length -1:
            while i < length - 1 and prices[i] >= prices[i+1]:
                i = i + 1
            valley = prices[i]
            while i< length -1 and prices[i] < prices[i+1]:
                i = i + 1
            peak = prices[i]
            profit += peak - valley
        return profit
        