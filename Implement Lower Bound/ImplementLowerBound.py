#https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1?track=DSASP-Searching&amp%253BbatchId=154&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=floor-in-a-sorted-array
#time complexity: O(logn)
#space complexity: O(1)
class Solution:
    #User function Template for python3
    
    #Complete this function
    def findFloor(self,A,N,X):
        #Your code here
        high = N-1
        low = 0
        while low <= high:
            mid = int(low + (high-low)/2)
            curr_num = A[mid]
            if curr_num == X:
                return mid
            elif curr_num > X:
                high = mid -1
            else : 
                low = mid + 1
        return high
        
