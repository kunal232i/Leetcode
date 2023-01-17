class Solution {
     static boolean safeCheck(int row, int col, char[][] board, int n){
        int tmpRow = row;
        int tmpCol = col;

        while(col>=0){
            if(board[row][col] == 'Q'){
                return false;
            }
            col--;
        }

        row = tmpRow;
        col = tmpCol;
        // upperDiagonal
        while(row>=0 && col>=0){
            if(board[row][col] == 'Q'){
                return false;
            }
            row--;
            col--;
        }

        row = tmpRow;
        col = tmpCol;
        //LowerDiagonal
        while(row<n && col>=0){
            if(board[row][col] == 'Q'){
                return false;
            }
            row++;
            col--;
        }
        return true;

    }
    static void helperFun(int n, List<List<String>> ans, char[][] board, int col){
        if(col == n){
            ans.add(construct(board));
            return;
        }
        for(int row=0; row<n; row++){
            if(safeCheck(row, col, board, n)){
                board[row][col] = 'Q';
                helperFun(n, ans, board, col+1);
                board[row][col] = '.';
            }
        }

    }   
    static List < String > construct(char[][] board) {
        List < String > res = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
    static public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = '.';
        helperFun( n, ans, board, 0);
        return ans;
    }
}