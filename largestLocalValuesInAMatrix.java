class Solution {
    public int[][] largestLocal(int[][] grid) {
        // n - 2 x n - 2
        int[][] maxLocal = new int[grid.length - 2][grid.length - 2];

        // i and j are for the maxLocal int array
        for(int i = 0; i < grid.length - 2; i++){
            for(int j = 0; j < grid.length - 2; j++){
                int max = 0;
                // k and l are to find the max in a
                // 3 x 3 grid in the grid int array
                for(int k = i; k <= i + 2; k++){
                    for(int l = j; l <= j + 2; l++){
                        if(max < grid[k][l]){
                            max = grid[k][l];
                        }
                    }
                }
                maxLocal[i][j] = max;
            }
        }

        return maxLocal;

        /*
        - Given: n x n int matrix grid
        - Goal: Generate an int matrix maxLocal of size 
        (n - 2) x (n - 2)
            - maxLocal[i][j] = largest value of the 
            3 x 3 matrix in grid centered around row
            i + 1 and column j + 1
            Return: generated matrix
        
        Ex:

          0 1 2 3
        0 9 9 8 1
        1 5 6 2 6
        2 8 2 6 4
        3 6 2 2 2

        First 3 x 3: i = 0; i < n - 1; i++
                     j = 0; j < n - 1; j++
        Second 3 x 3: i = 1; i < n; i++
                      j = 0; j < n - 1; j++
        Third 3 x 3: i = 0; i < n - 1; i++
                     j = 1; j < n; j++
        Fourth 3 x 3: i = 1; i < n; i++
                      j = 1; j < n; j++
        */
    }
}
