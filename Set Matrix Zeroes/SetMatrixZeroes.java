/**
 * time complexity: O(m*n)
 * space complexity: O(1)
 * where m is the number of rows in the matrix and n is the number of columns in the matrix
 *
 * approach:
 * 1. We use the first row and the first column of the matrix itself as markers to indicate which rows and columns should be set to zero.
 * 2. The first row is used to mark columns that need to be zeroed.
 * 3. The first column is used to mark rows that need to be zeroed.
 * 4. The element matrix[0][0] is a special case. 
 *    - If matrix[0][0] is 0, we know that the 0th row has to be set to zero.
 *    - We use an additional variable 'colZero' to specifically track whether the first column needs to be zeroed. 
 * 5. In the initial pass, we iterate through the matrix:
 *    - If we encounter a '0', we mark the corresponding row and column by setting matrix[i][0] and matrix[0][j] to 0.
 * 6. After the initial pass:
 *    - We iterate through the columns except the 0th one, setting all elements in a column to 0 if matrix[0][j] is 0.
 *    - We iterate through the rows, setting all elements in a row to 0 if matrix[i][0] is 0.
 * 7. Finally, if colZero is 0, we set the entire first column to 0.
 */

 class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        int colZero = 1;
        for(int i=0;i<rowLen;i++)
        {
            for(int j=0;j<colLen;j++)
            {
                if(matrix[i][j] == 0)
                {   
                    matrix[i][0] = 0;
                    if(j==0) colZero = 0;
                    else matrix[0][j] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        for(int j = colLen-1; j>0; j--)
        {   
            if(matrix[0][j]==0)
            {
                for(int i = 0; i<rowLen ;i++)
            {
                matrix[i][j] = 0;
            }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        for(int i = rowLen-1; i>=0; i--)
        {   
            if(matrix[i][0] == 0)
            {
                for(int j = 0; j<colLen ;j++)
            {
                matrix[i][j] = 0;
            }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        if(colZero == 0)
        {
            for(int i=0;i<rowLen;i++)
            {
                matrix[i][0] = 0;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}