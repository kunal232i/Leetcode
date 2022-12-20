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
        return true;
        
        /*
        rules

        hashSet -> 
        Traverse through every row and check for duplicate
        same for col

        inserting - O(1) checking - O(1)

        o(9^2)

        row
        0-3 1-3 2-3

        any position like [4,4] in sudoku borad

        by row form it'll be 4/3,4/3 -> [1,1]

        why divide by 3 because main it is 3,3 grid
        hashmap
        key(r/3,c/3)


        Sudoku
        012345678
        1
        2
        3
        4   *
        5
        6
        7
        8


        hashset<string> seen
        loop through all row and col
        if(not empty){
            if(
            !row in seen
            !same for col
            !also add subbox number)return false
        }


        hash set trick.

        */
    }
}