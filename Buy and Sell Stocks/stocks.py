'''
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
time complexity: O(n) where n is the size of the prices list
space complexity: O(1)
approach: we make profit when we purchase at a lesser price than the one we are selling at. for max profit, we should be purchasing at least price and selling at the max price.
we iterate over the list and keep track of the minimum price until that point, if on the current day, price is greater than the current minimum price, we will make a profit. keep track of this profit and update it if we find another day in future where selling price is more than on the current day.
in essence, we need to keep track of :
1. minimum price until the current day
2. max profit until the current day
'''

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0
        minimum_price = 10 ** 5
        for curr_price in prices:
            if curr_price < minimum_price:
                minimum_price = curr_price
            else:
                profit = max(profit,curr_price - minimum_price)
        return profit