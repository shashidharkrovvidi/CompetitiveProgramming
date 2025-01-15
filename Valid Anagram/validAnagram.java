/**
 https://leetcode.com/problems/valid-anagram/
time complexity: O(n) where n is the max of length of s and t strings
space complexity: O(1)
approach: if lengths of s and t string are not same, return false
maintain a frequency array
iterate over the s string and update the frequency array
iterate over the t string and decrease the frequencies of the characters
if any of the frequency of the frequency array is not 0, return false
 */
class Solution {
    public boolean isAnagram(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        if(sLen != tLen) return false;
        int[] sFreq = new int[256];
        for(char c : s.toCharArray())
        {
            sFreq[c]++;
        }
        for(char c : t.toCharArray())
        {
            sFreq[c]--;
        }
        for(int i : sFreq)
        {
            if(i != 0) return false;
        }
        return true;
    }
}