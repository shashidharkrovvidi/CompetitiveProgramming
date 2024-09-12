#https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
#time complexity: O(logn)
#space complexity: O(1)
class Solution:

    def count(self,arr, n, x):
        # code here
        first_index = self.findIndex(arr,n,x,True)
        second_index = self.findIndex(arr,n,x,False)
        if first_index == -1 and second_index == -1:
            return 0
        return second_index - first_index + 1
    
    def findIndex(self,arr,n,x,find_first_index):
        low = 0
        high = len(arr) - 1
        result = -1
        while low <= high:
            mid = (int)(low + (high-low)/2)
            curr_num = arr[mid]
            if curr_num > x:
                high = mid -1
            elif curr_num < x:
                low = mid + 1
            elif curr_num == x and find_first_index:
                high = mid - 1
                result = mid
            elif curr_num == x and not find_first_index:
                low = mid + 1
                result = mid
        return result
    