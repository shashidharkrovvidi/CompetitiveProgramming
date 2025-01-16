/**
time complexity: O(numRows * numRows)
space complexity: O(numRows)
 */
import java.util.List;
import java.util.ArrayList;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0) return result;
        result.add(List.of(1));
        if(numRows == 1) return result;
        result.add(List.of(1,1));
        if(numRows == 2) return result;
        for(int i= 2;i<numRows;i++)
        {   
            List<Integer> prev = result.get(i-1);
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j=1;j<prev.size();j++)
            {
                temp.add(prev.get(j)+prev.get(j-1));
            }
            temp.add(1);
            result.add(temp);
        }
        return result;
    }
}