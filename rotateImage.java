class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Transpose
        for(int row = 0; row < n; row++){
            for(int col = row + 1; col < n; col++){
                int tmp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = tmp;
            }
        }

        // Reverse
        for(int row = 0; row < n; row++){
            // Keeping the center the same,
            // and only switching the ones around it,
            // looking at the columns on the left of the center
            for(int col = 0; col < n / 2; col++){
                int tmp = matrix[row][col];
                // n - 1 - col
                // because the matrix can be bigger than a 3 x 3
                // so it closes in, towards the center,
                // so have to take j into account
                matrix[row][col] = matrix[row][n - 1 - col];
                matrix[row][n - 1 - col] = tmp;
            }
        }
    }
}
