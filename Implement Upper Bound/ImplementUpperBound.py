#https://www.geeksforgeeks.org/problems/ceil-the-floor2802/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=ceil-the-floor
#time complexity : O(nlogn)
#space complexity: O(1)
class Solution:
    def getFloorAndCeil(self, x: int, arr: list) -> list:
        # code here
        low = 0
        high = len(arr) - 1
        arr.sort()
        if x < arr[low]:
            return -1,arr[low]
        if x > arr[high]:
            return arr[high],-1
        while low <= high:
            mid = (int)(low + (high - low)/2)
            curr_num = arr[mid]
            if curr_num == x:
                return x,x
            elif curr_num > x:
                high = mid - 1
            else: 
                low = mid + 1
        return arr[high],arr[low]
        
