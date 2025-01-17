/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
time complexity: O(n) where n is the size of the prices array
space complexity: O(1)
approach: we make profit when we purchase at a lesser price than the one we are selling at. for max profit, we should be purchasing at least price and selling at the max price.
we iterate over the list and keep track of the minimum price until that point, if on the current day, price is greater than the current minimum price, we will make a profit. keep track of this profit and update it if we find another day in future where selling price is more than on the current day.
in essence, we need to keep track of :
1. minimum price until the current day
2. max profit until the current day
*/
class Stocks {
    public int maxProfit(int[] prices) {
        int result = 0;
        int minPrice = Integer.MAX_VALUE;
        int len = prices.length;
        for(int i=0;i<len;i++)
        {
            int currPrice = prices[i];
            if(currPrice < minPrice)
            {
                minPrice = currPrice;
            }
            else
            {
                result = Math.max(result,currPrice-minPrice);
            }
        }
        return result;
    }
}