"""
https://leetcode.com/problems/valid-anagram/
Time complexity: O(n) where n is the maximum length of strings s and t.

Space complexity: O(1) as the size of the frequency array 
                     (256 for ASCII characters) is constant.
Approach:
    1. If the lengths of strings s and t are different, they cannot be anagrams.
    2. Create a frequency array to store the counts of each character.
    3. Iterate through string s and increment the frequency of each character in the array.
    4. Iterate through string t and decrement the frequency of each character in the array.
    5. If any frequency in the array is not zero, the strings are not anagrams.
"""
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        frequency = [0] * 256
        for c in s:
            frequency[ord(c)] = frequency[ord(c)] + 1
        for c in t:
            frequency[ord(c)] = frequency[ord(c)] - 1
        for i in frequency:
            if i != 0:
                return False
        return True
        