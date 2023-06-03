class Solution {
    public void rotate(int[][] matrix) {
        for(int row=0; row<matrix.length; row++){
            for(int col=row; col<matrix[row].length; col++){
                int t = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = t;
            }
        }
        
         for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
    }
}