/**
 * https://leetcode.com/problems/majority-element/
time complexity: O(n) where n is the size of the nums array
space complexity: O(1)
approach: if an element is a majority element, that should be the one which is left after the entire iteration
we consider the first element to be the majority element and increment the count if we find similar element
if we find any other element, we decrement the count. different element will cancel the current majority element
when the count  = 0, it would mean that until that point there is no majority element, so we consider the next element after this one to be new majority element with a current count of 1 */
class Majority {
    public int majorityElement(int[] nums) {
        int element = nums[0];
        int count = 0;
        int len = nums.length;
        for(int i=0;i<len;i++)
        {   
            if(count==0)
            {
                element = nums[i];
                count = 1;
            }
            else if(element == nums[i])
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        return element;
    }
}