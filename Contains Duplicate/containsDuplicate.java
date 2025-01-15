/**
 * https://leetcode.com/problems/contains-duplicate/description/
time complexity: O(l) where l is the length of the nums array
space complexity: O(l) where l is the length of the nums array
approach: iterate over the nums array and add number to the hashset if it is not already present in it. if the number is already present in the hashset, return true
*/
import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums)
        {
            if(set.contains(i)) return true;
            set.add(i);
        }
        return false;
    }
}