class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet();
        
        for(int r=0; r<9; r++){
            for(int c=0; c<9; c++){
                char ch = board[r][c];
                if(ch != '.'){
                    if(!seen.add(ch+"row"+r) ||
                       !seen.add(ch+"col"+c) ||
                       !seen.add(ch+"in block "+ r/3 + "-" +c/3))
                        return false;
                }
            }
        }
        System.out.print(seen);
        return true;
    }
}