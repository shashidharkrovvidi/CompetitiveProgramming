'''
https://leetcode.com/problems/contains-duplicate/description/
time complexity: O(n) where n is the length of the nums list
space complexity: O(n) where n is the length of the nums list
approach: iterate over the numbers of the nums list and add them to a numSet list if the current number is not present in numSet, else return True
'''
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        numSet = set()
        for currNum in nums:
            if currNum in numSet:
                return True
            numSet.add(currNum)
        return False