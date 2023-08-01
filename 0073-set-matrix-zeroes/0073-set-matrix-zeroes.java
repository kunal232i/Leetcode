class Solution {
    public void setZeroes(int[][] matrix) {
        boolean rowPos[] = new boolean[matrix.length];
        boolean colPos[] = new boolean[matrix[0].length];
        
        for(int row=0; row<matrix.length; row++){
            for(int col=0; col<matrix[row].length; col++){
                if(matrix[row][col] == 0){
                    rowPos[row]=true;
                    colPos[col]=true;
                }
            }
        }
        
        for(int row=0; row<matrix.length; row++){
            for(int col=0; col<matrix[row].length; col++){
                if(rowPos[row] || colPos[col]){
                    matrix[row][col]=0;
                }
            }
        }
    }
}