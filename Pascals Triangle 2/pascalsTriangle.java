import java.util.ArrayList;
import java.util.List;

/**
time complexity: O(rowIndex * rowIndex)
space complexity: O(rowIndex)
 */
class Solution {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex == 0) return List.of(1);
        if(rowIndex == 1) return List.of(1,1);
        List<Integer> prev = List.of(1,1);
        for(int i=2;i<rowIndex+1;i++)
        {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            int lenPrev = prev.size();
            for(int j = 1;j<lenPrev;j++)
            {
                temp.add(prev.get(j-1)+prev.get(j));
            }
            temp.add(1);
            prev = temp;
        }
        return prev;
    }
}