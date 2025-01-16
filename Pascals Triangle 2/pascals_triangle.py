'''
https://leetcode.com/problems/pascals-triangle-ii/
time complexity: O(rowIndex * rowIndex)
space complexity: O(rowIndex)
'''
class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        if rowIndex == 0:
            return [1]
        if rowIndex == 1:
            return [1,1]
        prev = [1,1]
        for i in range(2,rowIndex+1):
            temp = [1]
            len_prev = len(prev)
            for j in range(1,len_prev):
                temp.append(prev[j-1]+prev[j])
            temp.append(1)
            prev = temp
        return prev
        