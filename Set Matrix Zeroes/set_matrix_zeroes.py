class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        **Approach:**

        1. **Initialization:**
           - `col_zero`: A flag to indicate if the first column needs to be zeroed. Initially set to 1 (not zeroed).

        2. **Mark Rows and Columns:**
           - Iterate through the matrix.
           - If an element `matrix[row][col]` is zero:
             - Mark the corresponding row by setting `matrix[row][0]` to zero.
             - Mark the corresponding column by setting `matrix[0][col]` to zero.
             - If the zero is encountered at `matrix[0][0]`, set `col_zero` to 0 to indicate that the first column also needs to be zeroed.

        3. **Zero Out Columns:**
           - Iterate through each column (excluding the first column).
           - If `matrix[0][col]` is zero (indicating the column needs to be zeroed), set all elements in that column to zero.

        4. **Zero Out Rows:**
           - Iterate through each row.
           - If `matrix[row][0]` is zero (indicating the row needs to be zeroed), set all elements in that row to zero.

        5. **Zero Out First Column (if necessary):**
           - If `col_zero` is 0, set all elements in the first column to zero.

        **Time Complexity:** O(m * n) 
        - The initial pass to mark rows and columns takes O(m * n) time.
        - Zeroing out columns and rows also takes O(m * n) time in the worst case.

        **Space Complexity:** O(1)
        - The code uses constant extra space (only `col_zero` variable).
        """
        row_len = len(matrix)
        col_len = len(matrix[0])
        col_zero = 1
        for row in range(0,row_len):
            for col in range(0,col_len):
                if matrix[row][col] == 0:
                    matrix[row][0] = 0
                    if col == 0:
                        col_zero = 0
                    else: 
                        matrix[0][col] = 0
        
        for col in range(1,col_len):
            for row in range(0,row_len):
                if matrix[0][col] == 0:
                    matrix[row][col] = 0
        for row in range(0, row_len):
            for col in range(1, col_len):
                if matrix[row][0] == 0:
                    matrix[row][col] = 0
        if col_zero == 0:
                for row in range(0,row_len):
                    matrix[row][0] = 0
