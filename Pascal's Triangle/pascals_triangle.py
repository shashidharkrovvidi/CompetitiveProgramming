'''
https://leetcode.com/problems/pascals-triangle/description/
time complexity: O(numRows * numRows)
space complexity: O(numRows)
'''
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result = []
        result.append([1])
        if numRows == 1:
            return result
        result.append([1,1])
        if numRows == 2:
            return result
        for i in range(2,numRows):
            prev = result[i-1]
            temp = []
            temp.append(1)
            len_prev = len(prev)
            for j in range(1,len_prev):
                temp.append(prev[j]+prev[j-1])
            temp.append(1)
            result.append(temp)
        return result




        
        